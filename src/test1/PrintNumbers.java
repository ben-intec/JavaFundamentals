package test1;

/*
    (1) Schrijf een programma dat alle getallen van 0 tot 10_000 afdrukt die voldoen aan de volgende voorwaarden:
    - Geen even getallen
    - Geen getallen die deelbaar zijn door 5

    - Bonus point: druk ook het aantal gevonden of afgedrukte getallen af
 */
public class PrintNumbers {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 10_000; i+= 2) {
            if (i % 5 != 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.printf("Found %d numbers that match assigned conditions.%n", count);
    }
}
