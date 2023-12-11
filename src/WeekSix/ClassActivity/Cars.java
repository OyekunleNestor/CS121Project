package WeekSix.ClassActivity;

public class Cars {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Cars(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
        System.out.println("Price: $" + price);
    }
}
