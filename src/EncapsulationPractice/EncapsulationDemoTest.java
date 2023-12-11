package EncapsulationPractice;

public class EncapsulationDemoTest {
    public static void main(String[] args) {
        EncapsulationDemo employee = new EncapsulationDemo("John Doe", 30, 50000.0, true);

        /* Accessing public variables and methods */
        employee.displayInfo();
        employee.promoteEmployee();

        /*
         Private variables and methods cannot be accessed outside the class.
         Uncommenting the lines below would result in compilation errors.
         System.out.println("Age: " + employee.age + ", Salary: " + employee.salary);
         employee.calculateBonus();
        */

    }
}
