package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by ankit on 8/7/16.
 */
public class PredicateExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(new String[]{"ram","shyam","ghanshyam"});
        Predicate<String> ifShyam = name -> name.contains("shyam");

        List<String> allShyams = names.stream().filter(ifShyam).collect(Collectors.toList());
        System.out.println(allShyams);
    }
}
