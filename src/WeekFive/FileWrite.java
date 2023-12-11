package WeekFive;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "CoursesTwo.txt";

            // Open the file for writing (and appending if necessary)
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            // Write a header
            writer.write("Course Name, Instructor, Credits");
            writer.newLine();

            // Ask the user for input data
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter Instructor: ");
            String instructor = scanner.nextLine();
            System.out.print("Enter Credits: ");
            String credits = scanner.nextLine();

            // Write the input data under the appropriate headers
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
