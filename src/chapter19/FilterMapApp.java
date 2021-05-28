package chapter19;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static chapter19.Person.Gender.FEMALE;
import static chapter19.Person.Gender.MALE;

public class FilterMapApp {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Luke", "Skywalker", MALE, 19, 70, 170),
                new Person("Jean-Luc", "Picard", MALE, 49, 75, 175),
                new Person("William", "Adama", MALE, 40, 88, 174),
                new Person("Malcolm", "Reynolds", MALE, 33, 85, 186),
                new Person("Leia", "Organa", MALE, 19, 43, 157),
                new Person("Seven", "Of Nine", FEMALE, 20, 55, 173),
                new Person("Number", "Six", FEMALE, 30, 61, 180),
                new Person("River", "Tam", FEMALE, 18, 50, 166)
        };

        //Opdracht 4a
        Arrays.stream(people).filter(p -> p.getGender().equals(FEMALE))
                .forEach(System.out::println);

        //Opdracht 4b
        Arrays.stream(people).filter(p -> p.getAge() > 19)
                .forEach(System.out::println);

        //Opdracht 4c
        Arrays.stream(people).filter(p -> p.getWeight() > 60)
                .filter(p -> p.getWeight() < 75)
                .forEach(System.out::println);


        //Opdracht 4d
        Arrays.stream(people).filter(p -> p.getAge() > 19)
                .filter(p -> p.getWeight() > 60)
                .forEach(System.out::println);

        //Opdracht 4e
        Arrays.stream(people).map(Person::getAge)
                .forEach(System.out::println);

        //Opdracht 4f
        Arrays.stream(people).map(Person::toString)
                .forEach(System.out::println);

        //Opdracht 4g
        System.out.println(Arrays.stream(people).mapToInt(Person::getAge).average().orElseThrow());
        System.out.println(Arrays.stream(people).mapToInt(Person::getAge).min().orElseThrow());
        System.out.println(Arrays.stream(people).mapToInt(Person::getAge).max().orElseThrow());

        //Opdracht 4h
        Arrays.stream(people).map(Person::getWeight)
                .forEach(System.out::println);

        //Opdracht 4i
        System.out.println(Arrays.stream(people).mapToDouble(Person::getWeight).average().orElseThrow());
        System.out.println(Arrays.stream(people).mapToDouble(Person::getWeight).min().orElseThrow());
        System.out.println(Arrays.stream(people).mapToDouble(Person::getWeight).max().orElseThrow());

        //Opdracht 4j
        System.out.println(IntStream
                .rangeClosed(0,1000)
                .filter(i -> i%5 == 0)
                .filter(i -> i%8 == 0)
                .limit(20)
                .mapToDouble(Double::valueOf)
                .reduce(0.0, (a,b) -> a + Math.sqrt(b))
        );

        //Opdracht 4k
        int[] ints = ThreadLocalRandom.current()
                .ints(0, 10000)
                .filter(i -> i % 2 == 0)
                .limit(500)
                .sorted()
                .toArray();
    }
}
