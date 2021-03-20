package Chapter5;

import Tools.InputRequests;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        getAge(scanner);

        Tools.Utils.pause(2000);

        getBMI(scanner);

        scanner.close();
    }

    //Opdracht 14 a
    public static void getAge(Scanner scanner) {

        //get user age
        var age = InputRequests.requestInt(scanner,"Hoe oud ben je?");

        //inform user
        var format = "je bent een %s%n";

        if (age < 2)
            System.out.printf(format,"baby");
        else if (age < 10)
            System.out.printf(format,"kind");
        else if (age < 20)
            System.out.printf(format,"tiener");
        else
            System.out.printf(format,"Volwassene");

    }

    //Opdracht 14 b
    public static void getBMI(Scanner scanner) {
        //get user weight
        var weight = InputRequests.requestFloat(scanner,"Hoeveel weeg je? (in kg)");

        //get user height
        var height = InputRequests.requestFloat(scanner, "Hoe groot ben je? (in m)");

        //calculate user BMI
        var bmi = weight / (height * height);

        //Inform user
        var format = "met een BMI van %.2f heb je %s%n";

        if(bmi<20)
            System.out.printf(format, bmi, "ondergewicht!");
        else if(bmi<25)
            System.out.printf(format, bmi, "een normaal gewicht!");
        else if(bmi<30)
            System.out.printf(format, bmi, "overgewicht!");
        else if(bmi<40)
            System.out.printf(format, bmi, "obesitas!");
        else
            System.out.printf(format, bmi, "ziekelijk overgewicht!");

    }
}
