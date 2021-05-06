package chapter12;

import tools.InputRequests;

import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {
//        String number = InputRequests.requestString(
//                new Scanner(System.in),
//                "Please input a number",
//                s -> s.matches("^\\d+$"),
//                "Only digits please!"
//        );

        String number = "12345";

        Integer i = Integer.parseInt(number);

        System.out.println(i);
        i+=50;
        System.out.println(i);

        System.out.println(i.byteValue());

    }
}
