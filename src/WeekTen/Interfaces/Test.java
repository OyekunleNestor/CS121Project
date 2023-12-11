package WeekTen.Interfaces;

// Interface Interactable
interface Interactable {
    void performInteraction();
}

// Class Member implementing Interactable interface
class Member implements Interactable {
    @Override
    public void performInteraction() {
        System.out.println("Member is interacting: Enrolling in classes, tracking workouts, viewing membership details.");
    }
}

// Class Trainer implementing Interactable interface
class Trainer implements Interactable {
    @Override
    public void performInteraction() {
        System.out.println("Trainer is interacting: Handling interactions related to training sessions.");
    }
}

// Test class
public class Test {
    public static void main(String[] args) {
        // Instantiate Member and Trainer classes
        Member member = new Member();
        Trainer trainer = new Trainer();

        // Call interface method and print the result
        System.out.println("Member Interaction:");
        member.performInteraction();

        System.out.println("------------------------");

        System.out.println("Trainer Interaction:");
        trainer.performInteraction();
    }
}
