package WeekEleven.sortingActivity;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        // Get unsorted array from the user
        int[] unsortedArray = sorting.getArray();

        // Print the unsorted array
        System.out.println("Unsorted Array:");
        for (int num : unsortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Use Bubble Sort to sort the array
        int[] bubbleSortedArray = sorting.bubbleSort(unsortedArray);

        // Print the sorted array using Bubble Sort
        System.out.println("Sorted Array (Bubble Sort):");
        for (int num : bubbleSortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Use Merge Sort to sort the array
        int[] mergeSortedArray = sorting.mergeSort(unsortedArray);

        // Print the sorted array using Merge Sort
        System.out.println("Sorted Array (Merge Sort):");
        for (int num : mergeSortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
