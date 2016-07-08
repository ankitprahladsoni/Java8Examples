package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by ankit on 8/7/16.
 */
public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate customDate = LocalDate.of(2016,1,14);
        System.out.println(customDate);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        System.out.println(LocalDate.parse("2016-01-01"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(formatter));

    }
}
