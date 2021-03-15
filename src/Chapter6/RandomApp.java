package Chapter6;

import java.util.Random;
import java.util.stream.Collectors;

/*
    OPDRACHT 1
 */
public class RandomApp {

    public static void main(String[] args) {

        randomGenerator();
        randomGenerator(7,89);
        randomGenerator(144,1087);
        randomGenerator(14,24);
        generateLottery();
    }

    public static void randomGenerator() {
        var rand = new Random();
        for (int i = 0; i < 5; )
            System.out.printf("Random #%d: %d%n", ++i, rand.nextInt());
    }

    public static void randomGenerator(int origin, int bound) {
        var rand = new Random();
        System.out.printf("Random within range(%d, %d): %d%n",
                origin, bound, rand.nextInt(bound - origin) + origin);
    }

    public static void generateLottery() {
        var resultStream = new Random().ints(6,1,46);

        var result = resultStream.boxed().map(String::valueOf).collect(Collectors.joining(" - "));

        System.out.printf("LOTTO : %s%n", result);
    }
}
