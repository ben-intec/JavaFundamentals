package chapter12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeApp {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate date2 = LocalDate.of(2015,6,23);
        LocalTime time2 = LocalTime.of(10,25,2);
        LocalDateTime dateTime2 = LocalDateTime.of(date2,time2);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println();
        System.out.println(date2);
        System.out.println(time2);
        System.out.println(dateTime2);

    }
}
