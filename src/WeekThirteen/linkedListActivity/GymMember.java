package WeekThirteen.linkedListActivity;
import java.util.LinkedList;

class GymMember {
    // instance variables
    private String name;
    private String email;
    private String membershipPlan;
    private LinkedList<String> enrolledClassesList;

    // constructor
    public GymMember(String name, String email, String membershipPlan, LinkedList<String> enrolledClassesList) {
        this.name = name;
        this.email = email;
        this.membershipPlan = membershipPlan;
        this.enrolledClassesList = enrolledClassesList;
    }

    // methods
    public void addEnrolledClass(String fitnessClass) {
        enrolledClassesList.add(fitnessClass);
    }

    public void cancelEnrolledClass(String fitnessClass) {
        enrolledClassesList.remove(fitnessClass);
    }

    public String getMemberInfo() {
        return "Name: " + name + "\nEmail: " + email + "\nMembership Plan: " + membershipPlan;
    }

    public void displayEnrolledClass() {
        System.out.println("Enrolled Classes:");
        for (String fitnessClass : enrolledClassesList) {
            System.out.println("- " + fitnessClass);
        }
    }
}