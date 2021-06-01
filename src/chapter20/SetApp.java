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

    //opdracht 2
    public static void main(String[] args) {
        runPeopleApp();

        runLotteryApp();

    }

    public static void runPeopleApp() {
       Person[] peopleArray = {
                new Person("Luke", "Skywalker", MALE, 19, 70, 170),
                new Person("Jean-Luc", "Picard", MALE, 49, 75, 175),
                new Person("William", "Adama", MALE, 40, 88, 174),
                new Person("Jean-Luc", "Picard", MALE, 49, 75, 175),
                new Person("Malcolm", "Reynolds", MALE, 33, 85, 186),
                new Person("Leia", "Organa", MALE, 19, 43, 157),
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

    public static void runLotteryApp() {
        Set<Integer> userInputSet = new HashSet<>();
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
        lottery.forEach(i -> System.out.print(i + " "));

        System.out.println("Your winning numbers are");
        userInputSet.forEach(i -> System.out.print(i + " "));
    }
}
