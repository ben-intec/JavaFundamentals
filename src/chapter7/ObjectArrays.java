package chapter7;

import tools.InputRequests;

import java.util.Scanner;

//Opdracht 2
public class ObjectArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputAsArray = getSplitSentence(scanner);

        for (String word : inputAsArray) {
            System.out.println(word);
        }

        scanner.close();
    }

    public static String[] getSplitSentence(Scanner scanner) {
        String input = InputRequests.requestString(
                scanner,
                "Please input a sentence of text",
                s -> s.matches(".+?[\\s].+?"),
                "More than one word please!");

        return input.split(" ");
    }
}
