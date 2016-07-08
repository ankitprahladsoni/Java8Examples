package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by ankit on 8/7/16.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(new String[]{"Manguba","Ghisuba","Bherulal"});
        Consumer<String> printNames = name -> System.out.println("name is "+name);

        names.forEach(printNames);
    }
}
