package chapter4;

import tools.InputRequests;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = InputRequests.requestInt(scanner, "Enter a number:");
        int b = InputRequests.requestInt(scanner, "Enter another number:");

        System.out.printf("the sum of your numbers is %d", a+b);
        scanner.close();
    }
}
