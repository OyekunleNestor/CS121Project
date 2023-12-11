package WeekFourteen.dateFormatActivity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the amount of calories allowed per day by a diet
        System.out.print("Enter the amount of calories allowed per day by a diet: ");
        int caloriesPerDay = scanner.nextInt();

        // Ask the user what date (as mm/dd/yyyy) the diet will start
        System.out.print("Enter the start date of the diet (as mm/dd/yyyy): ");
        String startDate = scanner.next();

        // Ask the user what date (as mm/dd/yyyy) the diet will end
        System.out.print("Enter the end date of the diet (as mm/dd/yyyy): ");
        String endDate = scanner.next();

        // Call the method in the TotalCalories class to get the total calories consumed during the diet time period
        int totalCalories = TotalCalories.calculateTotalCalories(caloriesPerDay, startDate, endDate);

        // Print the result
        System.out.println("Total calories consumed during the diet period: " + totalCalories);

        scanner.close();
    }
}
