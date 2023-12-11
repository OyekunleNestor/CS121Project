package WeekThirteen.genericsActivity;

import java.util.ArrayList;

class GenericMethods {
    // Generic method to print elements of an ArrayList
    public <T> void printArrayList(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}