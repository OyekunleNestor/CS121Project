package WeekTen;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseInfo courseInfo = new CourseInfo();

        while (true) {
            System.out.println("Enter a course name or 'q' to quit:");
            String courseName = scanner.nextLine();

            if (courseName.toLowerCase().equals("q")) {
                break;
            }

            System.out.println("Enter GPA:");
            double gpa = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter letter grade:");
            char letterGrade = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character

            System.out.println("Enter score:");
            int score = Integer.parseInt(scanner.nextLine());

            courseInfo.addCourse(courseName, gpa, letterGrade, score);
        }

        courseInfo.displayCourseInfo();
    }
}
