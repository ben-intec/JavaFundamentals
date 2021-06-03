package chapter20;

import tools.InputRequests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class LotteryApp {
    //Opdracht 2A & 3
    public static void main(String[] args) {
        Set<Integer> userInputSet = new LinkedHashSet<>();
//        Set<Integer> userInputSet = new HashSet<>();
        Set<Integer> lottery = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while(userInputSet.size() <= 6){
            int num = InputRequests.requestInt(
                    scanner,
                    "Please input a number from 1 to 45:",
                    i -> i > 0 && i < 46 && !userInputSet.contains(i),
                    "Try again:"
            );
            userInputSet.add(num);
        }

        while(lottery.size() <= 6){
            lottery.add(ThreadLocalRandom.current().nextInt(0,46));
        }

        userInputSet.retainAll(lottery);

        System.out.println("the winning numbers are");
        System.out.println(lottery);

        System.out.println("Your winning numbers are");
        System.out.println(userInputSet);
    }
}
