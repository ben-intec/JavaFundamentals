package test2.edition2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
    Maak een int array (1d) van 100 getallen en vul deze met random getallen.

    Sorteer nu de array van klein naar groot (of van groot naar klein, je mag zelf kiezen wat het makkelijkste is)
    TIP: bekijk de javadoc van de Arrays class

    Druk de eerste 20 getallen af van de array om te controleren of de sortering gelukt is.
 */
public class QuestionFive {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

//        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);


        for (int i = 0; i < 20; i++) {
            System.out.printf("%d\t", numbers[i]);
        }


    }
}
