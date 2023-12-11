package WeekTen;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList stringList = new StringArrayList();

        stringList.addString("Apple");
        stringList.addString("Banana");
        stringList.addString("Orange");

        System.out.println("List Size: " + stringList.getSize());
        System.out.println("Element at Index 1: " + stringList.getElement(1));

        System.out.println("Displaying using for-each loop:");
        stringList.displayUsingForEachLoop();

        System.out.println("Displaying using regular for loop:");
        stringList.displayUsingRegularForLoop();
    }
}
