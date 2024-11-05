import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int MAX_ATTEMPTS = 5;
    private static final int MAX_ROUNDS = 3;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roundsPlayed = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + LOWER_BOUND + " and " + UPPER_BOUND + ".");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts per round.");
        System.out.println("You have " + MAX_ROUNDS + " rounds in this game");
        while (roundsPlayed < MAX_ROUNDS) {
            System.out.println("\nRound " + (roundsPlayed + 1) + " begins!");
            if (playRound(scanner)) {
                roundsWon++;
            }
            roundsPlayed++;
            System.out.println("Congratulation! Rounds won so far: " + roundsWon);
            
            if (roundsPlayed < MAX_ROUNDS) {
                System.out.print("Do you want to play the next round? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    break;
                }
            }
        }
        
        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + roundsPlayed);
        System.out.println("Total Rounds Won: " + roundsWon);
        scanner.close();
    }

    private static boolean playRound(Scanner scanner) {
        Random random = new Random();
        int targetNumber = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess (" + (attempts + 1) + "/" + MAX_ATTEMPTS + "): ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Correct! You've guessed the right number.");
                return true;
            } else if (userGuess < targetNumber) {
                System.out.println("Low!");
            } else {
                System.out.println("High!");
            }
        }
        System.out.println("You've used all your attempts. The correct number was: " + targetNumber);
        return false;
    }
}
