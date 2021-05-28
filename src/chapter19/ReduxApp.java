package chapter19;

import java.util.Arrays;

public class ReduxApp {

    public static void main(String[] args) {

        //Opdracht 2a
        int[] array = { 12, 53, 85, 34, 23, 19, 4, 99, 122, 6, 63, 87, 2 };

        System.out.printf("%s%ncount: %d%nmax: %d%nmin: %d%naverage: %f%nsum: %d%nsum of squares: %d%n",
                Arrays.toString(array),
                Arrays.stream(array).count(),
                Arrays.stream(array).max().getAsInt(),
                Arrays.stream(array).min().getAsInt(),
                Arrays.stream(array).average().getAsDouble(),
                Arrays.stream(array).sum(),
                Arrays.stream(array).reduce(0, (a, b) -> a + (b * b))
        );

        //Opdracht 2b
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        String reduced = Arrays.stream(lorem.split(" +")).reduce("",(s1,s2)-> s1.concat(";"+s2)).substring(1);
        System.out.println(reduced);

    }
}
