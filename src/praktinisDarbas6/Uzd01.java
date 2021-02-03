package praktinisDarbas6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Uzd01 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        fillList(numbers);

        //System.out.println(numbers);
        measureSortTime(numbers);
    }

    private static void measureSortTime(List<Integer> numbers) {
        long startTime = System.currentTimeMillis();
        Collections.sort(numbers); // quick sort
        long endTime = System.currentTimeMillis();
        System.out.println("Sort time: " + (endTime - startTime));
    }

    private static void fillList(List<Integer> numbers) {
        Random randomNumber = new Random();
        for (int i = 0; i < 5000000; i++) {
            numbers.add(randomNumber.nextInt());
        }
    }
}
