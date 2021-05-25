package chapter18;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextApp {

    public static void main(String[] args) {
        TextPrinter printer =
                new TextPrinter("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                        "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        //filter
        System.out.println("Contains e:");
        printer.printFilteredWords(s -> s.contains("e"));
        System.out.println();

        System.out.println("Longer than 4 letters:");
        printer.printFilteredWords(s -> s.length() > 4);
        System.out.println();

        System.out.println("Starts with a:");
        printer.printFilteredWords(s -> s.startsWith("a"));
        System.out.println();

        System.out.println("second letter is e:");
        printer.printFilteredWords(s -> s.substring(1).startsWith("e"));
        System.out.println();

        System.out.println("two or more e's:");
        printer.printFilteredWords(s -> s.indexOf('e') != s.lastIndexOf('e'));
        System.out.println();

        //process
        System.out.println("Reversed :");
        printer.printProcessedWords(TextUtils::reverse);
        System.out.println();

        TextScrambler textScrambler = new TextScrambler();
        System.out.println("Scramble :");
        printer.printProcessedWords(textScrambler::scramble);
        System.out.println();

        System.out.println("Lower case :");
        printer.printProcessedWords(String::toLowerCase);
        System.out.println();

        //number
        System.out.println("Number parsing :");
        printer.PrintNumberValues(s -> new BigDecimal(TextPrinter.convertToASCII(s)));
        System.out.println();

        System.out.println("Sum :");
        printer.printSum(s -> new BigDecimal(TextPrinter.convertToASCII(s)));
        System.out.println();

        //predicate
        Predicate<String> containsE = s -> s.contains("e");
        Predicate<String> containsA = s -> s.contains("a");

        System.out.println("Contains e & a:");
        printer.printFilteredWords(s -> (containsE.and(containsA)).test(s));
        System.out.println();

        //Function
        Function<String,String> func = s -> TextUtils.reverse(s.toUpperCase());
        System.out.println("Uppercase case :");
        printer.printProcessedWords(s ->  func.apply(s));
        System.out.println();
    }
}
