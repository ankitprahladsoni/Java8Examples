package functionalinterface;

import java.util.function.Supplier;

/**
 * Created by ankit on 8/7/16.
 */
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Integer> newInteger = SupplierExample::getCount;
        System.out.println(newInteger.get());
    }

    private static Integer getCount(){
        return 1;
    }
}
