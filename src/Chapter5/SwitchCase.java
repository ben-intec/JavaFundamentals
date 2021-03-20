package Chapter5;

import Tools.InputRequests;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

//Opdracht 15
public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int month = InputRequests.requestInt(
                scanner,
                "Please input a  month, number between 1 and 12",
                m -> (m <= 12 && m > 0),
                "this month doesn't exist in our calendar, doofus!");

        getDaysInMonth(month);

        scanner.close();
    }

    //get number of days in a given month
    public static void getDaysInMonth(int month) {

        //count the days
        int days = switch (month) {
            case 2 -> isLeapYear() ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        String monthName = switch (month){
            case  1 -> "January";
            case  2 -> "February";
            case  3 -> "March";
            case  4 -> "April";
            case  5 -> "May";
            case  6 -> "June";
            case  7 -> "July";
            case  8 -> "August";
            case  9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            default -> "December";
        };

        //inform the user
        System.out.printf("In %s, there are %d days", monthName,days);
    }

    public static boolean isLeapYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Year.now().getValue());
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
