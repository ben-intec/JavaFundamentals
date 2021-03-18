package Test1;

import java.util.Scanner;

/*
    (3) Schrijf een programma dat de gebruiker zijn naam vraagt.
    Het programma drukt vervolgens "Hallo <gebruikersnaam>" af.
    Vervang <gebruikersnaam> door de naam van de gebruiker in 'leet'-code.
    Leet-code:
    - een 'o' wordt vervangen door een 0 (zero)
    - een 'e' wordt vervangen door een 3
    - een 's' wordt vervangen door een 5
 */
public class LeetUsername {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();


        System.out.printf("Hallo %s.%n", getLeetName(name));

        scanner.close();
    }

    public static String getLeetName(String name) {

        return name.replaceAll("(?i)o","0").replaceAll("(?i)e","3").replaceAll("(?i)s","5");
    }
}
