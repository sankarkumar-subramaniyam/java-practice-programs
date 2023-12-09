package collections;

import java.util.Map;
import java.util.TreeMap;

public class MapOps {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(0, 1);
        treeMap.put(22, -1);
        treeMap.put(5, 1);
        treeMap.put(10, -1);
        treeMap.put(15, 1);
        treeMap.put(20, -1);

        int totalCars = 0;

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            totalCars += entry.getValue();
            System.out.println(" Key:" + entry.getKey() + " ; Value: " + entry.getValue() + " totalCars:" + totalCars);
        }

    }
}
