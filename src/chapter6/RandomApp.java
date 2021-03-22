package chapter6;

import java.util.Random;
import java.util.stream.Collectors;

/*
    OPDRACHT 1
 */
public class RandomApp {

    public static void main(String[] args) {
        var random = new Random();

        randomGenerator(random, 5);
        randomGeneratorInRange(random, 7,89);
        randomGeneratorInRange(random, 144,1087);
        randomGeneratorInRange(random, 14,24);
        getLotteryNumbers(random);
        generateLottery(random);
    }

    public static void randomGenerator(Random random, int count) {

        for (int i = 0; i < count; )
            System.out.printf("Random #%d: %d%n", ++i, random.nextInt());
    }

    public static void randomGeneratorInRange(Random random, int origin, int bound) {
        System.out.printf("Random within range(%d, %d): %d%n",
                origin, bound, getRandomInt(random, origin,bound));
    }

    public static int getRandomInt (Random random, int origin, int bound) {

        return random.nextInt(bound - origin) + origin;
    }

    public static void getLotteryNumbers(Random random) {
        for (int i = 0; i < 6; i++)
            System.out.println("Lottery number " + (i + 1) + " is " + getRandomInt(random, 1, 46));
    }

    public static void generateLottery(Random random) {
        var resultStream = random.ints(6,1,46);

        var result = resultStream.boxed().map(String::valueOf).collect(Collectors.joining(" - "));

        System.out.printf("LOTTO : %s%n", result);
    }
}
