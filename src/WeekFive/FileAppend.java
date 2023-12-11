package WeekFive;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "Courses.txt";

            // Open the file for appending
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            // Ask the user for more values
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Course Name to append: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter Instructor to append: ");
            String instructor = scanner.nextLine();
            System.out.print("Enter Credits to append: ");
            String credits = scanner.nextLine();

            // Write the input data to the existing file
            writer.write(courseName + ", " + instructor + ", " + credits);
            writer.newLine();

            // Close the file
            writer.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
