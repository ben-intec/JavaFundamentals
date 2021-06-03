package chapter20;

import chapter19.Person;

import java.util.ArrayDeque;
import java.util.Deque;

import static chapter19.Person.Gender.FEMALE;
import static chapter19.Person.Gender.MALE;

public class DequeApp {

    public static void main(String[] args) {
        Person[] peopleArray = {
                new Person("Luke", "Skywalker", MALE, 19, 70, 170),
                new Person("Leia", "Organa", FEMALE, 19, 43, 157),
                new Person("Jean-Luc", "Picard", MALE, 49, 75, 175),
                new Person("Seven", "Of Nine", FEMALE, 20, 55, 173),
                new Person("William", "Adama", MALE, 40, 88, 174),
                new Person("Number", "Six", FEMALE, 30, 61, 180),
                new Person("Malcolm", "Reynolds", MALE, 33, 85, 186),
                new Person("River", "Tam", FEMALE, 18, 50, 166)
        };
        Deque<Person> people = new ArrayDeque<>();
        for (Person person : peopleArray) {
            if (person.getGender() == MALE) people.offerFirst(person);
            else people.offerLast(person);
        }

        while (!people.isEmpty()) {
            Person man = people.pollFirst();
            Person woman = people.pollLast();
            System.out.printf(
                    "%s %s meets %s %s%n",
                    man.getFirstName(),
                    man.getLastName(),
                    woman.getFirstName(),
                    woman.getLastName()
            );
        }
    }
}
