package org.incorp.i;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] words = {"aa", "bb", "cc", "aa", "dd", "cc", "aa", "dd",};
        System.out.println(Arrays.toString(words));

        Map<String, Integer> hmap = new HashMap<>();
        for (String x : words) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);
        Phone book = new Phone();
        book.add("i1", "11111111");
        book.add("i2", "22222222");
        book.add("i3", "33333333");
        book.add("i4", "44444444");
        book.add("i5", "55555555");
        book.add("i6", "66666666");
        book.add("i7", "77777777");
        System.out.println("Number: " + book.get("i1"));
        System.out.println("Number: " + book.get("i2"));
        System.out.println("Number: " + book.get("i5"));
        System.out.println("Number: " + book.get("i7"));
        System.out.println("Number: " + book.get("i4"));
    }
}

