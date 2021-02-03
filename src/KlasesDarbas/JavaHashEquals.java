package KlasesDarbas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHashEquals {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "Katinas");
        map.put(1, "Katinas");
        map.put(2, "Suo");

        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(map);
        System.out.println(set);

        Map<People, String> mapObjects = new HashMap<>();
        Set<People> setObjects = new HashSet<>();



    }
}
