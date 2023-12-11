package WeekTen;

import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> stringList = new ArrayList<>();

    public void addString(String str) {
        stringList.add(str);
    }

    public void removeString(String str) {
        stringList.remove(str);
    }

    public int getSize() {
        return stringList.size();
    }

    public String getElement(int index) {
        return stringList.get(index);
    }

    public void displayUsingForEachLoop() {
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public void displayUsingRegularForLoop() {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
