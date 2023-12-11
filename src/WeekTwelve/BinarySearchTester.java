package WeekTwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();

        // Prefill an ArrayList using Arrays.asList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23, 17, 12, 90, 84, 38, 5, 77, 44));

        System.out.print("unsorted: ");
        printArrayList(list);
        System.out.println();

        // Sort the ArrayList using selectionSort
        selectionSort(list);

        System.out.print("sorted:   ");
        printArrayList(list);
        System.out.println();

        // Search for a number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());
        int found = demo.binarySearch(key, list);

        if (found == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.printf("Item found at index %d, position %d", found, found + 1);
        }
    }

    // Change the value of an ArrayList element using set
    public static void selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    // Helper method to print the ArrayList with aligned numbers
    private static void printArrayList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.printf("%-3d", num);
        }
    }
}