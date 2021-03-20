package Test1;

import java.util.Scanner;

/*
    (5) Schrijf een programma dat een paswoord vraagt als input (een String)
    Het programma kijkt vervolgens na of de ingegeven String een sterk paswoord is.
    Een sterk paswoord moet aan de volgende voorwaarden voldoen:

    - minimum 16 characters
    - moet minimaal 1 kleine letter bevatten (a - z)
    - moet minimaal 1 grote letter bevatten (A - Z)
    - moet minimaal 1 speciaal character bevatten (bv: !, #, %, $, &, ...)
 */
public class PasswordChecker {


    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        requestPassword(scanner, "Please input a password worthy of the Jedi");

        scanner.close();
    }

    public static void requestPassword(Scanner scanner, String message) {

        System.out.println(message);
        String password = scanner.nextLine();

        var has16 = password.length() > 15;
//        var hasLowerCase = password.matches("^.*[a-z]+.*$");
//        var hasUpperCase = password.matches("^.*[A-Z]+.*$");
//        var hasSpecial = password.matches("^.*[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]+.*$");

        var hasLowerCase = password.chars().anyMatch(Character::isLowerCase);
        var hasUpperCase = password.chars().anyMatch(Character::isUpperCase);
//        var hasNumber = password.chars().anyMatch(Character::isDigit);
        var hasSpecial = !password.chars()
                .filter(c -> !(Character.isWhitespace(c) || Character.isSupplementaryCodePoint(c)))
                .allMatch(Character::isLetterOrDigit);


        if (!has16)
            requestPassword(scanner, "Password needs to contain a minimum of 16 characters");
        else if (!hasLowerCase)
            requestPassword(scanner, "Password needs to contain at least one lower case character");
        else if (!hasUpperCase)
            requestPassword(scanner, "Password needs to contain at least one upper case character");
        else if (!hasSpecial)
            requestPassword(scanner, "Password needs to contain at least one special character !\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]+$");
        else
            System.out.println("Well done Young Padawan, that is a strong password!");
    }
}


