package EncapsulationPractice;
public class EncapsulationDemo {
    private String name;
    private final int age;
    private final double salary;
    public boolean isActive;

    public EncapsulationDemo(String name, int age, double salary, boolean isActive) {
        this.setName(name);
        this.age = age;
        this.salary = salary;
        this.isActive = isActive;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Active: " + isActive);
    }

    void promoteEmployee() {
        System.out.println("Employee promoted.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
