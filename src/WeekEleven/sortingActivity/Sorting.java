package WeekEleven.sortingActivity;

import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    // Step 1: create a method getArray()
    public int[] getArray() {
        int[] unsortedArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 unsorted integers:");

        for (int i = 0; i < 5; i++) {
            unsortedArray[i] = scanner.nextInt();
        }

        scanner.close();

        return unsortedArray;
    }

    // Step 2: create a method sortArray() using Bubble Sort
    public int[] bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap array[i-1] and array[i]
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return array;
    }

    // Step 3: create a method sortArray() using Merge Sort
    public int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
