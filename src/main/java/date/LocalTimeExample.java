package date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by ankit on 8/7/16.
 */
public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);

        LocalTime customTime = LocalTime.of(15,21,45);
        System.out.println(customTime);

        LocalTime afterTwoHours = time.plusHours(2);
        System.out.println(afterTwoHours);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH::mm::ss");
        System.out.println(time.format(formatter));
    }

}
