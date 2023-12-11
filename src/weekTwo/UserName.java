package weekTwo;

import java.util.Scanner;

public class UserName {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Uppercase: " + (firstName + " " + lastName).toUpperCase());
        System.out.println("Lowercase: " + (firstName + " " + lastName).toLowerCase());
        String reverseName = lastName + " " + firstName;
        System.out.println("Reverse Order: " + reverseName);
        input.close();
    }
}
