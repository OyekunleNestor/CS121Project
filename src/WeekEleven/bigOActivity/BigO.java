package WeekEleven.bigOActivity;

public class BigO {
    public void printOnce(Object value) {
        System.out.println(value);
    }

    public void printNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Printing " + (i + 1) + " time(s)");
        }
    }

    public void printNSquaredTimes(int n) {
        for (int i = 0; i < n * n; i++) {
            System.out.println("Printing " + (i + 1) + " time(s)");
        }
    }
}
