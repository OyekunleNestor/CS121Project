package WeekFive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "Courses.txt";

            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;

            // Read and display each line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
