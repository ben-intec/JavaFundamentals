package Tools;

import java.util.Scanner;
import java.util.function.Predicate;

public class InputRequests {
    public static void main(String[] args) {
        int number = requestInt(new Scanner(System.in),"input number greater than 20", i -> i > 20, "try again");

        System.out.println(number);
    }

    //INTEGERS
    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  The requested value
     */
    public static int requestInt(Scanner scanner, String request) {
        return requestInt(scanner, request, null);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     *
     * @return  The requested value
     */
    public static int requestInt(Scanner scanner, String request, Predicate<Integer> predicate) {
        return requestInt(scanner, request, predicate, request);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  The requested value
     */
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

    //LONGS
    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  The requested value
     */
    public static long requestLong(Scanner scanner, String request) {
        return requestLong(scanner, request, null);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     *
     * @return  The requested value
     */
    public static long requestLong(Scanner scanner, String request, Predicate<Long> predicate) {
        return requestLong(scanner, request, predicate, request);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  The requested value
     */
    public static long requestLong(Scanner scanner, String request, Predicate<Long> predicate, String errorMessage){

        long number ;
        System.out.println(request);

        while(!scanner.hasNextLong()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextLong();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextLong();
            }
        }

        return number;
    }

    //DOUBLES
    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  The requested value
     */
    public static double requestDouble(Scanner scanner, String request) {
        return requestDouble(scanner, request, null);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     *
     * @return  The requested value
     */
    public static double requestDouble(Scanner scanner, String request, Predicate<Double> predicate) {
        return requestDouble(scanner, request, predicate, request);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  The requested value
     */
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

    //DOUBLES
    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  The requested value
     */
    public static float requestFloat(Scanner scanner, String request) {
        return requestFloat(scanner, request, null);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     *
     * @return  The requested value
     */
    public static float requestFloat(Scanner scanner, String request, Predicate<Float> predicate) {
        return requestFloat(scanner, request, predicate, request);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  The requested value
     */
    public static float requestFloat(Scanner scanner, String request, Predicate<Float> predicate, String errorMessage){

        float number ;
        System.out.println(request);

        while(!scanner.hasNextFloat()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextFloat();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextFloat();
            }
        }

        return number;
    }

    //STRINGS
    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  The requested value
     */
    public static String requestString(Scanner scanner, String request) {
        return requestString(scanner, request, null);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     *
     * @return  The requested value
     */
    public static String requestString(Scanner scanner, String request, Predicate<String> predicate) {
        return requestString(scanner, request, predicate, request);
    }

    /**
     * Method that request input from the user and only returns a value when input matches desired conditions
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  The requested value
     */
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
