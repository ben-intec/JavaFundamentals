package chapter9.game;

import tools.InputRequests;

import java.util.Scanner;

public class HigherLowerApp implements HigherLowerGame.OnGuessListener {

    Scanner scanner;
    static HigherLowerGame game;

    public static void main(String[] args) {

        HigherLowerApp app = new HigherLowerApp();
        app.scanner = new Scanner(System.in);
        app.newGame();

    }

    public void newGame() {
        if (game == null) {

            game = new HigherLowerGame(10);
            game.setListener(this);
        } else {
            game.reset();
        }

        int guess = InputRequests.requestInt(scanner, "I'm thinking of a number between 0 and 20. Can you guess it?");

        game.guess(guess);
    }

    @Override
    public void onGuessedToHigh() {
        int guess = InputRequests.requestInt(scanner, "You guessed TOO HIGH! Try again.");

        game.guess(guess);
    }

    @Override
    public void onGuessedToLow() {
        int guess = InputRequests.requestInt(scanner, "You guessed TOO LOW! Try again.");

        game.guess(guess);
    }

    @Override
    public void onGuessedCorrect() {
//        scanner = scanner.reset();

        String requestString = InputRequests.requestString(
                scanner,
                "CONGRATULATIONS! YOU WON! Would you like to play again? (Y/N)",
                s -> s.matches("(?i)^[Y|N]$"),
                "Just Y or N please!");

        if (requestString.equalsIgnoreCase("Y"))
            newGame();
        else
            System.out.println("Owkay :(");
    }
}
