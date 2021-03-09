package Chapter5;

import java.util.Scanner;

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
            System.out.println("this month doesn't exist in our calendar, dufus!");
            return;
        }

        //count the days
        int days;

        switch (month){
            case 2:
                days = 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        //inform the user
        System.out.printf("In month with number %d, there are %d days", month,days);
    }
}
