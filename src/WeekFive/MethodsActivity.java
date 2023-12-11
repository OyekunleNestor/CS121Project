package WeekFive;
import java.util.Scanner;

public class MethodsActivity {
    // Declare a static Scanner object to be used throughout the class
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Call methods to get length and width from the user
        double length = getLength();
        double width = getWidth();

        // Calculate the area
        double area = getArea(length, width);

        // Display the data
        displayData(length, width, area);

        // Close the scanner
        scanner.close();
    }

    public static double getLength() {
        System.out.print("Enter the rectangle's length: ");
        return scanner.nextDouble();
    }

    public static double getWidth() {
        System.out.print("Enter the rectangle's width: ");
        return scanner.nextDouble();
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static void displayData(double length, double width, double area) {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}
