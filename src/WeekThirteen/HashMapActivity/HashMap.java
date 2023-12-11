package WeekThirteen.HashMapActivity;

import java.util.HashMap;
import java.util.Map;

class MyHashMap {
    private Map<String, String> myMap;

    public MyHashMap() {
        this.myMap = new HashMap<>();
    }

    public void addKeyValuePair(String key, String value) {
        myMap.put(key, value);
    }

    public void removeKeyValuePair(String key) {
        myMap.remove(key);
    }

    public String getValueByKey(String key) {
        return myMap.get(key);
    }

    public void displayKeyValues() {
        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

