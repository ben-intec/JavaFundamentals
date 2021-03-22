package chapter5;


import java.util.Scanner;

public class DoWhileDo {
    public static void main(String[] args) {
//        countDownFrom120();
//        multiplesOfThree();
//        printLetters();
        numberCheck();
    }

    //Opdracht 16 a - tel af van 120 tot 100
    public static void countDownFrom120() {
        int i = 120 ;
        while (i > 99) System.out.println(i--);
    }

    //Opdracht 16 b - Veelvouden van 3 kleiner dan 50
    public static void multiplesOfThree() {
        int i = 0;
        while (i < 50){
            System.out.println(i);
            i += 3;
        }
    }

    //Opdracht 16 c - Machten van 5 kleiner dan 10_000
    public static void powersOfFive() {
//        int i = 5;
//        while (i < 10_000){
//            System.out.println(i);
//            i *= 5;
//        }

        int i = 0, result = 0;
        while (result < 10_000){
            result = (int) Math.pow(5,i++);
            System.out.println(result);
        }
    }

    //Opdracht 16 d - letters afprinten
    public static void printLetters() {
        int i =65;
        while(i<91) {
            char c = (char) i++;
            System.out.println(c);
        }
    }

    //Opdracht 16 e - nummer in range (0-10) met check
    public static void numberCheck() {
        Scanner scanner = new Scanner(System.in);
        int i = -1;

        do {
            System.out.println("Please input a number between 0 and 10");
            i = scanner.nextInt();
        } while (i < 0 || i > 10);

        System.out.println("Thank you for your cooperation!");

        scanner.close();
    }
}
