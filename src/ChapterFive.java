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
        System.out.println("Hoe oud ben je?");

        var age = scanner.nextInt();
        var formatAge = "je bent een %s%n";

        if (age<2) System.out.printf(formatAge,"baby");
        else if (age<10) System.out.printf(formatAge,"kind");
        else if (age<20) System.out.printf(formatAge,"tiener");
        else System.out.printf(formatAge,"Volwassene");

    }

    //Opdracht 14 b
    public static void getBMI(Scanner scanner) {
        System.out.println("Hoeveel weeg je? (in kg)");
        var weight = scanner.nextFloat();

        System.out.println("Hoe groot ben je? (in m)");
        var height = scanner.nextFloat();

        var bmi = weight / (height * height);
        var formatBmi = "met een BMI van %.2f heb je %s%n";

        if(bmi<20) System.out.printf(formatBmi, bmi, "ondergewicht!");
        else if(bmi<25) System.out.printf(formatBmi, bmi, "een normaal gewicht!");
        else if(bmi<30) System.out.printf(formatBmi, bmi, "overgewicht!");
        else if(bmi<40) System.out.printf(formatBmi, bmi, "obesitas!");
        else System.out.printf(formatBmi, bmi, "ziekelijk overgewicht!");
    }
}
