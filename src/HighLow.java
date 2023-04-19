import java.util.Random;
import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        guessingGame();
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void guessingGame() {
        int numberToGuess = generateRandomNumber();
        int numberOfGuesses = 1;
        boolean guess = false;
        int maxAttempts = 11;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 - 100 (You only have 10 guesses): ");
        do {
            int userGuess = scanner.nextInt();
            if (userGuess < numberToGuess) {
                System.out.format("Higher...%nNumber of guesses: %d%n", numberOfGuesses);
                System.out.println("Enter a number higher than the previous: " + userGuess);
                numberOfGuesses += 1;
            } else if (userGuess == numberToGuess) {
                System.out.println("...Good Guess!...");
                System.out.format("Number of guesses: %d", numberOfGuesses);
                guess = true;
            } else {
                System.out.format("...Lower%nNumber of guesses: %d%n", numberOfGuesses);
                System.out.println("Enter a number lower than the previous: " + userGuess);
                numberOfGuesses += 1;
            }
        } while (guess == false && numberOfGuesses < maxAttempts);
        System.out.println("Game Over! You used all your attempts!");
    }


}
