package com.java.project.collections;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding entries
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        // Output sorted by keys
        for (Integer key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
