package WeekThirteen.genericsActivity;

import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Create an instance of GenericMethods class
        GenericMethods genericMethods = new GenericMethods();

        // Example ArrayLists of 4 different types with different values
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.5, 2.7, 3.8, 4.1, 5.9));
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('x', 'y', 'z', 'w', 'v'));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

        // Call printArrayList() for each ArrayList type
        System.out.print("Integer arraylist: ");
        genericMethods.printArrayList(intList);

        System.out.print("\nDouble arraylist: ");
        genericMethods.printArrayList(doubleList);

        System.out.print("\nChar arraylist: ");
        genericMethods.printArrayList(charList);

        System.out.print("\nString arraylist: ");
        genericMethods.printArrayList(stringList);
    }
}