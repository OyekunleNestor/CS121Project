package WeekNine;
import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays
        int[] intArray = new int[3];
        double[] doubleArray = new double[3];
        String[] stringArray = new String[3];

        // Populate int array
        System.out.println("Enter three integers:");
        for (int i = 0; i < intArray.length; i++) {
            while (true) {
                try {
                    intArray[i] = Integer.parseInt(scanner.nextLine());
                    break; // Exit the loop if input is successfully parsed
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        // Populate double array
        System.out.println("Enter three decimal numbers:");
        for (int i = 0; i < doubleArray.length; i++) {
            while (true) {
                try {
                    doubleArray[i] = Double.parseDouble(scanner.nextLine());
                    break; // Exit the loop if input is successfully parsed
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a decimal number.");
                }
            }
        }

        // Populate string array
        System.out.println("Enter three strings:");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }

        // Print arrays in a table with headers
        System.out.printf("%-6s%-10s%-10s%s\n", "Index", "Integers", "Decimals", "Strings");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-6d%-10d%-10.2f%s\n", i, intArray[i], doubleArray[i], stringArray[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
