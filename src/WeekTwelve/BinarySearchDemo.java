package WeekTwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
    public int binarySearch(int key, ArrayList<Integer> list) {
        int counter = 0; // keeps track of comparisons
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;

        while (low <= high && list.get(mid) != key) {
            if (list.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
            System.out.println("comparison: " + ++counter);
        }

        if (low > high) {
            mid = -1;
        }
        return mid;
    }
}