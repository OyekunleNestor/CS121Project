package WeekSix.ClassActivity;
public class Characters {
    private String name;
    private int age;
    private String role;

    public Characters(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void displayCharacterInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Role: " + role);
    }
}
