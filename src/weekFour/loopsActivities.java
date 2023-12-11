package weekFour;

import java.util.Scanner;

public class loopsActivities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100, or enter 'q' to quit.");

        while (true) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Quitting the game. The correct number was " + randomNumber);
                break;
            }

            try {
                int guess = Integer.parseInt(input);
                numberOfGuesses++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + guess);
                    System.out.println("It took you " + numberOfGuesses + " guesses.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 100, or 'q' to quit.");
            }
        }

        scanner.close();
    }
}
