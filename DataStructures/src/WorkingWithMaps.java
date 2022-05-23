import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Hannah");
        myMap.put(2, "Jamil");
        myMap.put(3, "Alice");

        System.out.println(myMap);
        System.out.println(myMap.get(1));
        System.out.println(myMap.keySet());

        for (int key : myMap.keySet()) {
            System.out.println(myMap.get(key));
        }

        myMap.forEach((k, v)->{
            System.out.println(k + " - " + v);
        });
    }

}