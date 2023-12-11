package WeekNine;

public class GymMembershipSimulation {
    public static void main(String[] args) {
        // Initialize gym class information: Class Name, Day, Time, Capacity, Status
        String[][] classes = {
                {"Yoga", "Monday", "10:00 AM", "20", "Available"},
                {"Zumba", "Wednesday", "05:30 PM", "15", "Available"},
                {"Pilates", "Friday", "08:00 AM", "25", "Available"}
        };

        // Print Classes (Initial)
        System.out.println("Initial Class Availability:");
        printClasses(classes);

        // Simulate Booking: Change status of the first class to "Full"
        classes[0][4] = "Full";

        // Print Classes (Updated)
        System.out.println("\nUpdated Class Availability:");
        printClasses(classes);
    }

    // Method to print class details
    private static void printClasses(String[][] classes) {
        System.out.println("Class Name | Day       | Time     | Capacity | Status");
        System.out.println("------------------------------------------------------");
        for (String[] gymClass : classes) {
            System.out.printf("%-11s| %-10s| %-9s| %-9s| %-7s%n",
                    gymClass[0], gymClass[1], gymClass[2], gymClass[3], gymClass[4]);
        }
    }
}
