package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by ankit on 8/7/16.
 */
public class FunctionExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(new String[]{"ram","shyam","ghanshyam"});
        Function<String,String> upperCase = name->name.toUpperCase();
        List<String> modifiedNames = names.stream().map(upperCase).collect(Collectors.toList());
        System.out.println(modifiedNames);
    }
}
