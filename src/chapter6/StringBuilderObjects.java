package chapter6;

import tools.Utils;

import java.util.stream.Collectors;

//OPDRACHT 4
public class StringBuilderObjects {
    public static void main(String[] args) {

        var sb1 = new StringBuilder(Utils.getRandomString());
        String string;
        do {
            string = Utils.getRandomString();
        } while (sb1.toString().equals(string));
        var sb2 = new StringBuilder(string);

        // Print 2 lines of text
        System.out.println(sb1);
        System.out.println(sb2);

        // Add some text to first line
        int length = sb1.length();
        System.out.println(sb1.append(" >>>Addendum.<<<  "));
        sb1.delete(length,sb1.length()); //remove the added text

        // reverse second line
        System.out.println(sb2.reverse());

        // remove all spaces
        System.out.println(
                sb1.replace(0,sb1.length(),
                    sb1.chars()
                    .filter(c -> c != ' ')
                    .mapToObj(item -> Character.toString((char) item))
                    .collect(Collectors.joining())
                )
        );

        // double every T
        System.out.println(
                sb2.replace(0, sb2.length(),
                    sb2.chars()
                    .mapToObj(item -> (item == 't') ? "tt" : Character.toString((char) item))
                    .collect(Collectors.joining())
                )
        );

    }
}
