package weekFour;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int numYears = scanner.nextInt();

        double totalRainfall = 0;
        int totalMonths = 0;

        for (int year = 1; year <= numYears; year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter inches of rainfall for Year " + year + ", Month " + month + ": ");
                double rainfall = scanner.nextDouble();
                totalRainfall += rainfall;
                totalMonths++;
            }
        }

        double averageRainfall = totalRainfall / totalMonths;

        System.out.println("Number of months: " + totalMonths);
        System.out.println("Total inches of rainfall for " + numYears + " years: " + totalRainfall);
        System.out.println("Average rainfall per month: " + averageRainfall);

        scanner.close();
    }
}
