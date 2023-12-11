package WeekThirteen.linkedListActivity;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // create instances of GymMember
        LinkedList<String> enrolledClassesList1 = new LinkedList<>();
        GymMember member1 = new GymMember("John Doe", "john@example.com", "Gold", enrolledClassesList1);

        LinkedList<String> enrolledClassesList2 = new LinkedList<>();
        GymMember member2 = new GymMember("Jane Doe", "jane@example.com", "Silver", enrolledClassesList2);

        // add classes to enrolledClassesList
        member1.addEnrolledClass("Yoga");
        member1.addEnrolledClass("Cardio");
        member1.addEnrolledClass("Weights");

        member2.addEnrolledClass("Pilates");
        member2.addEnrolledClass("Zumba");
        member2.addEnrolledClass("Kickboxing");
        member2.addEnrolledClass("Spinning");

        // print member information
        System.out.println("Member 1 Information:");
        System.out.println(member1.getMemberInfo());
        member1.displayEnrolledClass();

        System.out.println("\nMember 2 Information:");
        System.out.println(member2.getMemberInfo());
        member2.displayEnrolledClass();

        // cancel one enrolled class for each member
        member1.cancelEnrolledClass("Yoga");
        member2.cancelEnrolledClass("Kickboxing");

        // print updated enrolled classes
        System.out.println("\nMember 1 Updated Enrolled Classes:");
        member1.displayEnrolledClass();

        System.out.println("\nMember 2 Updated Enrolled Classes:");
        member2.displayEnrolledClass();
    }
}