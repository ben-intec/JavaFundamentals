import java.util.Scanner;

public class ChapterFive {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

//        getAge(scanner);
//
//        Utils.pause(2000);

        getBMI(scanner);

        scanner.close();
    }

    //Opdracht 14 a
    public static void getAge(Scanner scanner) {

        //get user age
        System.out.println("Hoe oud ben je?");

        var age = scanner.nextInt();

        //inform user
        var format = "je bent een %s%n";

        if (age<2)
            System.out.printf(format,"baby");
        else if (age<10)
            System.out.printf(format,"kind");
        else if (age<20)
            System.out.printf(format,"tiener");
        else
            System.out.printf(format,"Volwassene");

    }

    //Opdracht 14 b
    public static void getBMI(Scanner scanner) {
        //get user weight
        System.out.println("Hoeveel weeg je? (in kg)");
        var weight = scanner.nextFloat();

        //get user height
        System.out.println("Hoe groot ben je? (in m)");
        var height = scanner.nextFloat();

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
