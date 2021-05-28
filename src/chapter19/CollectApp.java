package chapter19;

import java.util.Arrays;
import java.util.stream.Stream;

public class CollectApp {

    public static void main(String[] args) {

        //opdracht 3
        Person[] people = Stream.of(
                new Person("Luke", "Skywalker"),
                new Person("Jean-Luc", "Picard"),
                new Person("William", "Adama"),
                new Person("Malcolm", "Reynolds")
        ).toArray(Person[]::new);

        System.out.println(Arrays.toString(people));

    }
}
