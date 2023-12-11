package WeekThirteen.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramSort {

    public static void main(String[] args) {
        // Sample list of strings
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("listen", "silent", "hello", "world", "act", "cat"));

        // Sorting the list of strings with the selected sorting algorithm (e.g., Quick Sort)
        quickSortAnagrams(stringList, 0, stringList.size() - 1);

        // Displaying the sorted list
        System.out.println("Sorted List with Anagrams Grouped Together: " + stringList);
    }

    // Method to implement Quick Sort for sorting the ArrayList of strings
    private static void quickSortAnagrams(ArrayList<String> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);

            quickSortAnagrams(list, low, pivotIndex - 1);
            quickSortAnagrams(list, pivotIndex + 1, high);
        }
    }

    // Helper method for Quick Sort to partition the list
    private static int partition(ArrayList<String> list, int low, int high) {
        String pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (areAnagrams(list.get(j), pivot)) {
                i++;
                // Swap list[i] and list[j]
                String temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        // Swap list[i+1] and list[high] (put the pivot in the correct position)
        String temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }

    // Method to check if two strings are anagrams
    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sorting the characters within the strings
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Checking if the sorted sequences of characters are equal
        return Arrays.equals(charArray1, charArray2);
    }

    // Problem-solving experience:
    /*
    Approach:
    - I chose the Quick Sort algorithm to sort the ArrayList of strings.
    - I created a helper method to check if two strings are anagrams, sorting their characters if necessary.
    - During the partition step in Quick Sort, I swapped strings if they were anagrams, ensuring they are grouped together.

    Challenges:
    - Ensuring correct index manipulation during the partition step in Quick Sort.
    - Efficiently checking for anagrams by sorting characters and comparing arrays.

    Learning:
    - Reinforced understanding of the selected sorting algorithm and its implementation.
    - Gained experience in handling string manipulation within the sorting process.
    - Improved problem-solving skills in the context of algorithm implementation.
    */
}
