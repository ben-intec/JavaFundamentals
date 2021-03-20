package Chapter3;
import java.io.IOException;
import java.util.Scanner;

import static Tools.Utils.pause;

public class HelloJava {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello World!");

        pause(1200);

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        pause(600);

        System.out.printf("Hello %s.%n", name);
        pause(800);

        System.out.println("I am JAVA");
        pause(900);

        System.out.printf("Nice to meet you, %s!%n", name);

        scanner.close();
    }

}
