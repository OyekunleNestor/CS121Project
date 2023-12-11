package weekThree;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();
        scanner.close();
        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral triangle.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }
    }
}
