package weekFour;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] colors = {"red", "green", "blue", "orange", "yellow"};
        int correctGuesses = 0;

        System.out.println("Welcome to the ESP Game!");
        System.out.println("Try to guess the computer's chosen color.");

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(5); // Generates a random number between 0 and 4
            String computerColor = colors[randomNumber];

            System.out.print("Enter your guess (red, green, blue, orange, or yellow): ");
            String userGuess = scanner.nextLine().toLowerCase();

            System.out.println("The computer's chosen color was: " + computerColor);

            if (userGuess.equals(computerColor)) {
                System.out.println("Correct!");
                correctGuesses++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("You guessed the correct color " + correctGuesses + " times out of 10.");

        scanner.close();
    }
}
