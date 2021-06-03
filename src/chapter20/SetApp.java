package chapter20;

import chapter19.Person;
import tools.InputRequests;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static chapter19.Person.Gender.FEMALE;
import static chapter19.Person.Gender.MALE;

public class SetApp {

    //opdracht 2 B
    public static void main(String[] args) {
       Person[] peopleArray = {
                new Person("Luke", "Skywalker", MALE, 19, 70, 170),
                new Person("Jean-Luc", "Picard", MALE, 49, 75, 175),
                new Person("William", "Adama", MALE, 40, 88, 174),
                new Person("Jean-Luc", "Picard", MALE, 49, 75, 175),
                new Person("Malcolm", "Reynolds", MALE, 33, 85, 186),
                new Person("Leia", "Organa", FEMALE, 19, 43, 157),
                new Person("Seven", "Of Nine", FEMALE, 20, 55, 173),
                new Person("Number", "Six", FEMALE, 30, 61, 180),
                new Person("River", "Tam", FEMALE, 18, 50, 166)
        };

       Set<Person> people = new HashSet<>();
        for (Person person : peopleArray) {
            people.add(person);
        }

        people.forEach(System.out::println);
    }
}
