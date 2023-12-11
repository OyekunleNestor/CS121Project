package weekThree;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of a planet (e.g., Mercury, Venus, Earth, Mars): ");
        String planetName = scanner.nextLine();

        scanner.close();
        switch (planetName.toLowerCase()) {
            case "mercury" -> {
                System.out.println("Mercury is the smallest planet in our solar system.");
                System.out.println("It is approximately 57.9 million kilometers away from the sun.");
            }
            case "venus" -> {
                System.out.println("Venus is similar in size to Earth.");
                System.out.println("It is approximately 108.2 million kilometers away from the sun.");
            }
            case "earth" -> {
                System.out.println("Earth is the third planet from the sun.");
                System.out.println("It is approximately 149.6 million kilometers away from the sun.");
            }
            case "mars" -> {
                System.out.println("Mars is often called the 'Red Planet'.");
                System.out.println("It is approximately 227.9 million kilometers away from the sun.");
            }
            default -> System.out.println("Sorry, we don't have information for that planet.");
        }
    }
}
