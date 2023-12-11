package WeekTen.AbstractClasses;

// Abstract class User
abstract class User {
    String name;
    String contactNumber;
    String email;
    String password;

    // Abstract method
    public abstract void displayProfile();
}

// Subclass Member inheriting from User
class Member extends User {
    // Additional attributes
    int membershipLevel;
    double fitnessProgress;

    // Constructor
    public Member(String name, String contactNumber, String email, String password, int membershipLevel, double fitnessProgress) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
        this.membershipLevel = membershipLevel;
        this.fitnessProgress = fitnessProgress;
    }

    // Implementation of abstract method
    @Override
    public void displayProfile() {
        System.out.println("Member Profile:");
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Membership Level: " + membershipLevel);
        System.out.println("Fitness Progress: " + fitnessProgress);
    }
}

// Subclass Trainer inheriting from User
class Trainer extends User {
    // Additional attributes
    String specialty;
    int sessionsConducted;

    // Constructor
    public Trainer(String name, String contactNumber, String email, String password, String specialty, int sessionsConducted) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
        this.specialty = specialty;
        this.sessionsConducted = sessionsConducted;
    }

    // Implementation of abstract method
    @Override
    public void displayProfile() {
        System.out.println("Trainer Profile:");
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Specialty: " + specialty);
        System.out.println("Sessions Conducted: " + sessionsConducted);
    }
}

// Test class
public class Test {
    public static void main(String[] args) {
        // Instantiate Member and Trainer subclasses
        Member member = new Member("John Doe", "123-456-7890", "john@example.com", "password123", 2, 75.5);
        Trainer trainer = new Trainer("Alice Smith", "987-654-3210", "alice@example.com", "trainerpass", "Cardio", 100);

        // Call abstract method and print profiles
        member.displayProfile();
        System.out.println("------------------------");
        trainer.displayProfile();
    }
}
