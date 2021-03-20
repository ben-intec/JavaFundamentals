package Test1;

import Tools.InputRequests;

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

        var operatorRequest = "Please input an operation: + ,  - ,  *  or  /";
        var numberRequest = "Please input a real number";

        var operator = InputRequests.requestString(
                scanner,
                operatorRequest,
                opr -> opr.length() == 1 && opr.matches("[-+/*]+"));

        var number1 = InputRequests.requestInt(
                scanner,
                numberRequest);

        var number2 = InputRequests.requestInt(
                scanner,
                numberRequest,
                i -> !isInvalid(operator,i),
                "0 is not allowed in this case");

        System.out.println(getResult(operator, number1, number2));

        scanner.close();
    }

    public static String getResult(String operator, int number1, int number2) {

        var format = "%d %s %d = %d";

        switch (operator){
            case "+":
                return String.format(format, number1, operator, number2, sum(number1,number2));
            case "-":
                return String.format(format, number1, operator, number2, diff(number1,number2));
            case "/":
                return String.format("%d %s %d = %.2f", number1, operator, number2, fraction(number1,number2));
            case "*":
                return String.format(format, number1, operator, number2, product(number1,number2));
            default:
                return "I sense a disturbance in the Force!";
        }
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
    

    //don't divide by 0
    public static boolean isInvalid(String operator, int number) {
        return operator.equals("/") && number ==0;
    }

}
