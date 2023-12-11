package WeekSix.ClassActivity;
import WeekSix.ClassActivity.Cars;
import WeekSix.ClassActivity.Characters;

public class TestClass {
    public static void main(String[] args) {
        // Instantiate Cars class
        Cars car1 = new Cars("Toyota", "Camry", 2022, 25000.0);
        car1.displayCarInfo();

        // Instantiate Characters class
        Characters character1 = new Characters("John Doe", 30, "Detective");
        character1.displayCharacterInfo();
    }
}
