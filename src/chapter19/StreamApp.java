package chapter19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamApp {

    public static void main(String[] args) {
        //Opdracht 1a
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        Arrays.stream(lorem.split(" +")).forEach(System.out::println);

        //Opdracht 1b
        IntStream.range(0,100).forEach(System.out::println);

        //Opdracht 1c
        Person[] people = {
                new Person("Luke", "Skywalker"),
                new Person("Jean-Luc", "Picard"),
                new Person("William", "Adama"),
                new Person("Malcolm", "Reynolds")
        };
        Arrays.stream(people).forEach(System.out::println);
    }
}
