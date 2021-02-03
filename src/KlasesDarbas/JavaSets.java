package KlasesDarbas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSets {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashed = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        fillSet(hashSet);
        fillSet(linkedHashed);
        fillSet(treeSet);

        System.out.println(hashSet);
        System.out.println(linkedHashed);
        System.out.println(treeSet);

        operationsWithSets() ;
    }

    private static void operationsWithSets() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        //Union

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        // Intersection

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //Difference

        Set<Integer> difference = new HashSet<>(set2);
        difference.removeAll(set1);
        System.out.println(difference);
    }

    private static void fillSet(Set<String> set) {
        set.add("Daiva");
        set.add("Tomas");
        set.add("Akvile");
        set.add("Tadas");
        set.add("Tomas");
    }

    }
