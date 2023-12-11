package WeekThirteen.HashMapActivity;

public class HashMapTest {
    public static void main(String[] args) {
        // Create an instance of the MyHashMap class
        MyHashMap myHashMap = new MyHashMap();

        // Add key/value pairs
        myHashMap.addKeyValuePair("One", "Value1");
        myHashMap.addKeyValuePair("Two", "Value2");
        myHashMap.addKeyValuePair("Three", "Value3");

        // Display all key/value pairs
        System.out.println("Before removal:");
        myHashMap.displayKeyValues();

        // Remove one key/value pair
        myHashMap.removeKeyValuePair("Two");

        // Display key/value pairs after removal
        System.out.println("\nAfter removal:");
        myHashMap.displayKeyValues();
    }
}
