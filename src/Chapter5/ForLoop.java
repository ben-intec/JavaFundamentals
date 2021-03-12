package Chapter5;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
//        countDown();
//        multiplesOf7();
//        powersOf11();
//        printLetters();
//        printNumbers();
//        commonMultiples();
        printPrimes();
    }

    //Opdracht 17 a - aftellen 400 -> 350
    public static void countDown() {
        for(int i = 400; i > 349; i--)
            System.out.println(i);
    }

    //Opdracht 17 b - veelvouden van 7 kleiner dan 200
    public static void multiplesOf7() {
        for (int i = 0; i < 200 ; i+=7)
            System.out.println(i);
    }

    //Opdracht 17 c - machten van 11 kleiner dan 100_000
    public static void powersOf11() {
        for(int i = 0, j = 11; Math.pow(j,i) < 100_000; i++)
            System.out.println((int) Math.pow(j,i));
    }

    //Opdracht 17 d - print 'z' tot 'a'
    public static void printLetters() {
        for(char c = 'z'; c >= 'a'; c--)
            System.out.println(c);
    }

    //Opdracht 17 e & f - print -10 tot +10
    public static void printNumbers() {
        for(int i = -10; i < 11; i++)
            System.out.printf("%s%d%n", i > 0 ? "+" : "", i);
    }

    //Opdracht 17 g - gemene veelvouden van 6  & 28 kleiner dan 10_000
    public static void commonMultiples() {
        for (int i = 0; i < 10_000 ; i+= 28)
            if(i % 6 == 0)
                System.out.println(i);
    }

    //Opdracht 17 h - positieve priemgetallen < 1000
    public static void printPrimes() {

        var primes = new ArrayList<Integer>();
        //check 2 & all uneven integers < 1000
        for(int i = 2; i < 1000; i+= 2){

            if(i == 2){
                primes.add(i--); // -- to switch to uneven numbers
                continue;
            }

            boolean isPrime = true; //assume true, check for false

            //Even numbers already excluded, so start at 3
            //no factors > half , so no need to check past i/2
            for (int j = 3; j < i/2; j++){
                if(i % j == 0) {
                    isPrime = false;
                    break; //one other factor is enough
                }
            }

            if(isPrime)
                primes.add(i);

        }

        System.out.printf("Numbers of primes is %s%n", primes.size());
        primes.stream().forEach(System.out ::println);
    }
}
