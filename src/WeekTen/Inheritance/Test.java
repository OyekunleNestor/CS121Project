package WeekTen.Inheritance;

// Main class to test the implementation
class Test {
    public static void main(String[] args) {
        // Creating a new member
        NewMember newMember = new NewMember("John Doe", "123-456-7890", "Premium", "No health issues", "2023-10-26");

        // Creating a returning member
        ReturningMember returningMember = new ReturningMember("Alice Smith", "987-654-3210", "Basic", "2023-11-15");

        // Printing the information of new member and returning member
        System.out.println("New Member Information:");
        System.out.println(newMember);

        System.out.println("\nReturning Member Information:");
        System.out.println(returningMember);
    }
}
