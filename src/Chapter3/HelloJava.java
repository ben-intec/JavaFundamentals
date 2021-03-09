package Chapter3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Extras.Utils.pause;

public class HelloJava {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello World!");

        pause(1200);

        System.out.println("What is your name?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        pause(600);

        System.out.printf("Hello %s.%n", name);
        pause(800);

        System.out.println("I am JAVA");
        pause(900);

        System.out.printf("Nice to meet you, %s!%n", name);
    }

}
