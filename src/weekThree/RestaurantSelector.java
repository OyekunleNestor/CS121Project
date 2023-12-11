package weekThree;
import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Restaurant Selector!");
        System.out.println("Please let us know about your dietary preferences:");

        System.out.print("Are there any vegetarians in your group? (yes/no): ");
        boolean vegetarian = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Are there any vegans in your group? (yes/no): ");
        boolean vegan = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Are there any gluten-free individuals in your group? (yes/no): ");
        boolean glutenFree = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Based on your preferences, here are the restaurants you can consider:");

        if (!vegetarian || !vegan || !glutenFree) {
            if (!vegetarian) {
                System.out.println("Joe's Gourmet Burgers");
            }
            if (!glutenFree) {
                System.out.println("Main Street Pizza Company");
            }
            if (!vegetarian && !vegan) {
                System.out.println("Mama's Fine Italian");
            }
        }

        if (vegetarian && vegan && glutenFree) {
            System.out.println("Corner Café");
            System.out.println("The Chef's Kitchen");
        } else {
            if (vegetarian) {
                System.out.println("Main Street Pizza Company");
                System.out.println("Corner Café");
                System.out.println("Mama's Fine Italian");
                System.out.println("The Chef's Kitchen");
            }
            if (vegan) {
                System.out.println("Corner Café");
                System.out.println("The Chef's Kitchen");
            }
            if (glutenFree) {
                System.out.println("Main Street Pizza Company");
                System.out.println("Corner Café");
                System.out.println("The Chef's Kitchen");
            }
        }

        scanner.close();
    }
}
