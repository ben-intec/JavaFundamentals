package chapter7;

import tools.InputRequests;

import java.util.Scanner;
//Opdracht 4
public class LookUpTables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String requestString = InputRequests.requestString(
                scanner,
                "input a word",
                s -> s.matches("^[a-zA-Z]+$"),
                "only one word");

        System.out.printf("%nYour word score is %d%n", getWordScore(requestString));

    }

    public static int getWordScore(String word) {
        int[] values = { 1,3,5,2,1,4,3,4,1,4,3,3,3,1,1,3,10,2,2,2,4,4,5,8,8,4 }; //scrabble letter waarde op alfabetische volgorde
        int score = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            score += values [c - 'a'];
        }
        return score;
    }
}