package test1;

import tools.InputRequests;

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

        String name = InputRequests.requestString(scanner, "Please input your name:");


        System.out.printf("Hallo %s.%n", getLeetName(name));

        scanner.close();
    }

    public static String getLeetName(String name) {

        return name
                .replaceAll("(?i)o","0")
                .replaceAll("(?i)i","1")
                .replaceAll("(?i)z","2")
                .replaceAll("(?i)e","3")
                .replaceAll("(?i)A","4")
                .replaceAll("(?i)s","5")
                .replaceAll(    "G","6")
                .replaceAll("(?i)t","7")
                .replaceAll("(?i)b","8")
                .replaceAll(    "g","9");
    }
}
