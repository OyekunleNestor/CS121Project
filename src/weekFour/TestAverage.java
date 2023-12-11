package weekFour;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of test scores per student: ");
        int numScoresPerStudent = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) {
            double totalScore = 0;
            for (int j = 1; j <= numScoresPerStudent; j++) {
                System.out.print("Enter test score " + j + " for student " + i + ": ");
                double score = scanner.nextDouble();
                totalScore += score;
            }
            double averageScore = totalScore / numScoresPerStudent;
            System.out.println("Average test score for student " + i + ": " + averageScore);
        }

        scanner.close();
    }
}
