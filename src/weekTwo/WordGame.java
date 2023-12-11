package weekTwo;

import java.util.Scanner;
public class WordGame {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter your city: ");
            String city = scanner.nextLine();

            System.out.print("Enter your college: ");
            String college = scanner.nextLine();

            System.out.print("Enter your major: ");
            String major = scanner.nextLine();

            System.out.print("Enter a type of animal: ");
            String animal = scanner.nextLine();

            System.out.print("Enter your pet's name: ");
            String petName = scanner.nextLine();

            scanner.close();

            // Generate and display the story
            String story = "There once was a person named " + name + " who lived in " + city + ".\n" +
                    "At the age of " + age + ", " + name + " went to college at " + college + ".\n" +
                    name + " graduated with a " + major + ". Then, " + name + " adopted a(n) " +
                    animal + " named " + petName + ". They both lived happily ever after!";

            System.out.println("\n" + story);
        }
    }
