package Chapter6;

import java.util.Random;
import java.util.stream.Stream;

public class StringObjects {
    static final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Blandit volutpat maecenas volutpat blandit aliquam etiam " +
            "erat velit. Facilisi morbi tempus iaculis urna id. Odio euismod lacinia at quis risus. Sit amet " +
            "facilisis magna etiam tempor orci. Ac turpis egestas sed tempus urna et pharetra. Tellus in hac " +
            "habitasse platea dictumst vestibulum rhoncus est. Dignissim suspendisse in est ante in nibh mauris " +
            "cursus mattis. Augue neque gravida in fermentum et sollicitudin ac orci. Hendrerit dolor magna eget " +
            "est. Molestie at elementum eu facilisis sed. Laoreet non curabitur gravida arcu ac tortor dignissim " +
            "convallis aenean. Viverra maecenas accumsan lacus vel facilisis volutpat est velit egestas. Nunc " +
            "congue nisi vitae suscipit tellus mauris a diam maecenas. In pellentesque massa placerat duis " +
            "ultricies lacus sed turpis. Lectus magna fringilla urna porttitor rhoncus dolor purus.";


    public static void main(String[] args) {
        var sentences = Stream.of(loremIpsum.split("\\.")).map(s -> s.trim().concat(".")).toArray(String[]::new);
//        for (int i = 0; i < sentences.length; i++) {
//            System.out.printf("%d. %s%n", i+1, sentences[i]);
//        }

        var string1 = getRandomString(sentences);
        printStringAndLength(string1);
        System.out.println();
        printAllCaps(string1);
        System.out.println();
        printAllLowerCase(string1);
        System.out.println();
        printReplaceAWithO(string1);
        System.out.println();
        countE(string1);
        System.out.println();

        String string2;
        do {
            string2 = getRandomString(sentences);
        } while (string1.equals(string2));

        compareStrings(string1,string2);
        System.out.println();
        sortStringsAlphabetically(string1, string2);

        String string3 = addSpaces(getRandomString(sentences));

        System.out.println();
        printTrimmedString(string3);

    }

    public static String getRandomString(String[] stringArray) {
        int index = new Random().nextInt(stringArray.length);
        return stringArray[index];
    }

    // Print text + length
    public static void printStringAndLength(String string) {
        System.out.printf("String:\"%s\" has a length of %d%n", string, string.length());
    }

    // ALL CAPS
    public static void printAllCaps(String string) {
        System.out.println(string.toUpperCase());
    }

    // all lowercase
    public static void printAllLowerCase(String string) {
        System.out.println(string.toLowerCase());
    }

    // Replace 'a' with 'o'
    public static void printReplaceAWithO(String string) {
        System.out.println(string.replace('a','o'));
    }

    // count n of 'e'
    public static void countE(String string) {
        int count = 0;
        for(var c : string.toCharArray()){
            if (c == 'e') count++;
        }
        System.out.printf("String:\"%s\" has %d e's%n", string, count);
    }

    // compare 2 strings
    public static void compareStrings(String s1, String s2) {
        System.out.println(s1);
        System.out.println(s2);
        System.out.printf("These strings are %sequal!%n",s1.equals(s2) ? "" : "NOT ");
    }

    // order strings alphabetically
    public static void sortStringsAlphabetically(String s1, String s2) {
        if (s1.compareTo(s2) < 0)
            System.out.printf("%s%n%s%n", s1, s2);
        else if (s1.compareTo(s2) > 0)
            System.out.printf("%s%n%s%n", s2, s1);
        else compareStrings(s1, s2);
    }

    // trim string
    public static void printTrimmedString(String string) {
        System.out.println(string.trim());
    }

    public static String addSpaces(String string) {
        return "    " + string + "     ";
    }
}
