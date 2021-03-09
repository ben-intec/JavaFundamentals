import java.util.Scanner;

public class ChapterFive {

    public static void task14() {
        System.out.println("Hoe oud ben je?");
        var scanner = new Scanner(System.in);
        var age = scanner.nextInt();
        var formatAge = "je bent een %s%n";
        if (age<2) System.out.printf(formatAge,"baby");
        else if (age<10) System.out.printf(formatAge,"kind");
        else if (age<20) System.out.printf(formatAge,"tiener");
        else System.out.printf(formatAge,"Volwassene");

        Utils.pause(1000);

        System.out.println("Hoeveel weeg je? (in kg)");
        var weight = scanner.nextFloat();

        System.out.println("Hoe groot ben je? (in m)");
        var height = scanner.nextFloat();

        var bmi = weight / (height * height);
        var formatBmi = "met een BMI van %f heb je %s%n";

        if(bmi<20) System.out.printf(formatBmi, bmi, "ondergewicht!");
        else if(bmi<25) System.out.printf(formatBmi, bmi, "een normaal gewicht!");
        else if(bmi<30) System.out.printf(formatBmi, bmi, "overgewicht!");
        else if(bmi<40) System.out.printf(formatBmi, bmi, "obesitas!");
        else System.out.printf(formatBmi, bmi, "ziekelijk overgewicht!");

        scanner.close();
    }
}
