package Extras;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Utils {


    public static String getRandomString() {

        final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua. Blandit volutpat maecenas volutpat blandit aliquam etiam " +
                "erat velit. Facilisi morbi tempus iaculis urna id. Odio euismod lacinia at quis risus. Sit amet " +
                "facilisis magna etiam tempor orci. Ac turpis egestas sed tempus urna et pharetra. Tellus in hac " +
                "habitasse platea dictumst vestibulum rhoncus est. Dignissim suspendisse in est ante in nibh mauris " +
                "cursus mattis. Augue neque gravida in fermentum et sollicitudin ac orci. Hendrerit dolor magna eget " +
                "est. Molestie at elementum eu facilisis sed. Laoreet non curabitur gravida arcu ac tortor dignissim " +
                "convallis aenean. Viverra maecenas accumsan lacus vel facilisis volutpat est velit egestas. Nunc " +
                "congue nisi vitae suscipit tellus mauris a diam maecenas. In pellentesque massa placerat duis " +
                "ultricies lacus sed turpis. Lectus magna fringilla urna porttitor rhoncus dolor purus.";

        var sentences = Stream.of(loremIpsum.split("\\.")).map(s -> s.trim().concat(".")).toArray(String[]::new);

        int index = new Random().nextInt(sentences.length);

        return sentences[index];
    }

    public static void pause(int ms) {
        try {

            TimeUnit.MILLISECONDS.sleep(ms);

        } catch(InterruptedException e) {

            System.err.format("IOException: %s%n", e);

        }
    }

}
