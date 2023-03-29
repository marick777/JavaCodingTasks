package week11;

import java.util.HashMap;
import java.util.Map;

public class MinValue {

    public static <K, V extends Comparable<V>> V getMinimumValue(Map<K, V> map) {
        V minValue = null;

        for (V value : map.values()) {
            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 45);
        map.put("H", 12);
        map.put("N", 43);
        map.put("J", -3);
        map.put("C", 9);
        map.put("B", 77);

        System.out.println(getMinimumValue(map));

    }
}
