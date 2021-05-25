package chapter18;

public class TextApp {

    public static void main(String[] args) {
        TextPrinter printer =
                new TextPrinter("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                        "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        System.out.println("Contains e:");
        printer.printWords(s -> s.contains("e"));
        System.out.println();

        System.out.println("Longer than 4 letters:");
        printer.printWords(s -> s.length() > 4);
        System.out.println();

        System.out.println("Starts with a:");
        printer.printWords(s -> s.startsWith("a"));
        System.out.println();

        System.out.println("second letter is e:");
        printer.printWords(s -> s.substring(1).startsWith("e"));
        System.out.println();

        System.out.println("two or more e's:");
        printer.printWords(s -> s.indexOf('e') != s.lastIndexOf('e'));

    }
}
