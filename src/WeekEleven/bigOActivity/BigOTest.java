package WeekEleven.bigOActivity;

public class BigOTest {
        public static void main(String[] args) {
            BigO bigO = new BigO();

            System.out.println("Printing Once:");
            bigO.printOnce("Hello!");

            System.out.println("\nPrinting N Times:");
            bigO.printNTimes(5); // Change the argument to any integer value

            System.out.println("\nPrinting N Squared Times:");
            bigO.printNSquaredTimes(3); // Change the argument to any integer value
        }
    }
