package Test1;

import java.util.Formatter;
import java.util.Scanner;

/*
    (4) Schrijf een calculator voor de basis bewerkingen (+, -, * en /)
    Het programma start met te vragen welke bewerking de gebruiker wilt uitvoeren.
    Vervolgens vraag het programma om 2 getallen in te geven.
    Je mag ervan uit gaan dat we gebruik maken van gehele getallen (dus geen komma-getallen)

    Het programma maakt daarna de geselecteerde berekening en drukt het resultaat af.

    !!! Zorg ervoor dat als de gebruiker om een deling vraagt dat het resultaat tot 2 cijfers na de komma afgedrukt wordt.  Gebruik hiervoor een Formatter object. (hint: je mag alle manieren gebruiken die we in de les gezien hebben)
    !!! Schrijf voor elke bewerking een aparte methode

 */
public class Calculator {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var operator = requestOperation(scanner);
        var number1 = requestNumber(scanner);
        int number2 = 0;

        //don't accept 0 in case of division
        do {
            number2 = requestNumber(scanner, "0 is not allowed in this case");
        } while (isInvalid(operator,number2));

        var formatter = new Formatter();
        String format = "%d %s %d = %d";
        switch (operator){
            case "+":
                formatter.format(format, number1, operator, number2, sum(number1,number2));
                break;
            case "-":
                formatter.format(format, number1, operator, number2, diff(number1,number2));
                break;
            case "/":
                formatter.format("%d %s %d = %.2f", number1, operator, number2, fraction(number1,number2));
                break;
            case "*":
                formatter.format(format, number1, operator, number2, product(number1,number2));
                break;
            default:
                System.out.println("I sense a disturbance in the Force!");
        }

        System.out.println(formatter.toString());
        scanner.close();
    }

    //OPERATIONS

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static long product(int a, int b) {
        return a * (long) b;
    }

    public static float fraction(int a, int b) {
        return a / (float) b;
    }

    //INPUT REQUESTS

    public static String requestOperation(Scanner scanner) {

        String operator = "";
        do {
            System.out.println("Please input an operation: + ,  - ,  *  or  /");
            operator = scanner.nextLine();
        } while (operator.length() != 1 || !operator.matches("[-+/*]+"));

        return operator;
    }

    public static int requestNumber(Scanner scanner) {
        return requestNumber(scanner, "Please input a real number");
    }

    public static int requestNumber(Scanner scanner, String message){

        int number ;
        System.out.println(message);

        while(!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextInt();
        return number;
    }

    //don't divide by 0
    public static boolean isInvalid(String operator, int number) {

        return operator.equals("/") && number ==0;
    }

}
