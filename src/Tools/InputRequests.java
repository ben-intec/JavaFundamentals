package Tools;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Predicate;

public class InputRequests {
    public static void main(String[] args) {
        int number = requestInt(new Scanner(System.in),"input number greater than 20", i -> i > 20, "try again");

        System.out.println(number);
    }

    //INTEGERS
    public static int requestInt(Scanner scanner, String request) {
        return requestInt(scanner, request, null);
    }

    public static int requestInt(Scanner scanner, String request, Predicate<Integer> predicate) {
        return requestInt(scanner, request, predicate, request);
    }

    public static int requestInt(Scanner scanner, String request, Predicate<Integer> predicate, String errorMessage){

        int number ;
        System.out.println(request);

        while(!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextInt();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextInt();
            }
        }

        return number;
    }

    //DOUBLES
    public static double requestDouble(Scanner scanner, String request) {
        return requestDouble(scanner, request, null);
    }

    public static double requestDouble(Scanner scanner, String request, Predicate<Double> predicate) {
        return requestDouble(scanner, request, predicate, request);
    }

    public static double requestDouble(Scanner scanner, String request, Predicate<Double> predicate, String errorMessage){

        double number ;
        System.out.println(request);

        while(!scanner.hasNextDouble()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextDouble();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextDouble();
            }
        }

        return number;
    }

    //STRINGS
    public static String requestString(Scanner scanner, String request) {
        return requestString(scanner, request, null);
    }

    public static String requestString(Scanner scanner, String request, Predicate<String> predicate) {
        return requestString(scanner, request, predicate, request);
    }

    public static String requestString(Scanner scanner, String request, Predicate<String> predicate, String errorMessage) {
        String result;

        System.out.println(request);

        result = scanner.nextLine();
        if (predicate != null) {

            while (! predicate.test(result)) {
                System.out.println(errorMessage);
                result = scanner.nextLine();
            }
        }

        return result;
    }
}
