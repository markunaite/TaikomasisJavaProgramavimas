package KlasesDarbas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        fillMap(hashMap);
        fillMap(linkedHashMap);
        fillMap(treeMap);

        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);
    }

    private static void fillMap(Map<Integer, String> map) {
        map.put(1, "Red");
        map.put(3, "Blue");
        map.put(2, "Green");
       map.put(8, "Yelow");
        map.put(13, "Pink");
        map.put(26, "Brown");
    }
}
