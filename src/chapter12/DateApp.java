package chapter12;

import tools.InputRequests;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.format("%s : [%d,%d]%n",month, month.minLength(), month.maxLength());
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("%s %n",day);
        }

        int day = InputRequests.requestInt(
                new Scanner(System.in),
                "What day of the week is it? (1-7)",
                i -> i > 0 && i < 8,
                "Input 1 for Monday, 2 for Tuesday,... , 7 for Sunday"
        );
        long toAdd = InputRequests.requestLong(
                new Scanner(System.in),
                "How many days do you want to add?",
                l -> l >= 0,
                "Sorry I can't travel back in time, input a positive number"
        );

        DayOfWeek today = DayOfWeek.of(day);

        System.out.printf("Today is a %s, in %d days it will be a %s", today, toAdd, today.plus(toAdd));
    }
}
