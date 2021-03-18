package Test1;

import java.util.Random;

/*
    (2) Grootste gemene deler
    Schrijf een programma dat de "Grootste Gemene Deler" (GGD) zoekt van 2 integers.
    De GGD van 2 integers is de grootste integer die beide getallen kan delen zonder rest.
    Voorbeeld: gegeven 2 integers: 15 en 25 > de GGD is 5, want dat is het grootste getal dat beide integers
    kan delen zonder een rest.
    */
public class GreatestCommonDenominator {
    public static void main(String[] args) {
        var random = new Random();
        int a = random.nextInt(100) ;
        int b = random.nextInt(100) ;
        int c = greatestCommonDenominator(a,b);
        System.out.printf("The greatest common denominator of %d and %d is %d", a, b, c);
    }

    static int greatestCommonDenominator(int number1, int number2) {
        int big = Math.max(number1, number2);
        int small = Math.min(number1, number2);

        if (small == 0) return big;

        return greatestCommonDenominator(small,  big % small);
    }
}
