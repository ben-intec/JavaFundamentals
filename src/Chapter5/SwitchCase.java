package Chapter5;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

//Opdracht 15
public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        getDaysInMonth(scanner);

        scanner.close();

    }

    //get number of days in a given month
    public static void getDaysInMonth(Scanner scanner) {

        //get month from user
        System.out.println("Please input a  month, number between 1 and 12");
        int month = scanner.nextInt();

        //check if month has a valid value
        if (month <= 0 || month > 12) {
            System.out.println("this month doesn't exist in our calendar, doofus!");
            getDaysInMonth(scanner);
            return;
        }

        //count the days
        int days = switch (month) {
            case 2 -> isLeapYear()? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        //inform the user
        System.out.printf("In month with number %d, there are %d days", month,days);
    }

    public static boolean isLeapYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Year.now().getValue());
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
