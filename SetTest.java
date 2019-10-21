package de.kantwert.commons.rest.properties;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        // Set
        NavigableSet<String> set1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        set1.addAll(Arrays.asList("a", "b", "c"));
        NavigableSet<String> set2 = new TreeSet<>(set1);

        // Out
        System.out.println(set1 + " " + set1.removeAll(Arrays.asList("A")) + " " + set1);
        System.out.println(set2 + " " + set2.removeAll(Arrays.asList("A", "A", "A", "A")) + " " + set2);

    }
}
