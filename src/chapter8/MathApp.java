package chapter8;

import java.text.DecimalFormat;

import static java.lang.Math.*;

//Opdracht 11
public class MathApp {
    public static void main(String[] args) {
        //print the cosine for all radians between 0 and 2π and add conversion to degrees
        for (double d = 0; d <= (2 * PI); d += 0.1) {
            System.out.printf("Cosine of angle of %s radians or %s° is %s%n",
                    new DecimalFormat("#.##").format(d),
                    new DecimalFormat("#.##").format(toDegrees(d)),
                    new DecimalFormat("#.##").format(cos(d))
            );
        }

    }
}
