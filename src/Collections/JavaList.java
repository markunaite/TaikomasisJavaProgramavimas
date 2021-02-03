package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("none");

        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }

        System.out.println();

        colors.set(1, "Red");

        for (String element : colors) {
            System.out.print(element + " ");
        }

        List<Integer> numbers = new LinkedList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(4);
        numbers.add(-5);
    }
}
