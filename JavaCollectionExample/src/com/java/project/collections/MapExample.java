package com.java.project.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map not part of Java Collection.
/*
 * Map<K,V> it is used to store data in key and value pairs.
 * Map is an interface which is present in until package which has
 * Implementation class like HashTable, HashMap, LinkedHashMap, TreeMap.
 * HashTable-> It will not allow any null values as a key and it is thread safe.
 * HashMap-> It will allow one null value as a key, does not allow duplicate and it is not thread safe
 * LinkedHashMap-> It maintains order of insertion and does not allow duplicates
 * TreeSet-> It sorts the key in ascending order and stores the entries.
 */
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();

		map.put("Bangalore", 1);
		map.put("Hydrabad", 2);
		map.put("Chennai", 3);
		map.put("Pune", 4);
		map.put("Mumbai", 5);
		map.put("Bangalore", 6);
		System.out.println(map.get("Chennai"));

		for (Map.Entry<String, Integer> me : map.entrySet()) {
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		// or
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println("TreeMap");
		Map<String, Integer> tmap = new TreeMap<>();

		tmap.put("Bangalore", 1);
		tmap.put("Hydrabad", 2);
		tmap.put("Chennai", 3);
		tmap.put("Pune", 4);
		tmap.put("Mumbai", 5);
		tmap.put("Bangalore", 6);
		
		for (Map.Entry<String, Integer> me : tmap.entrySet()) {
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		
		System.out.println("LinkedHashMap");
		
		Map<String, Integer> lhmap = new LinkedHashMap<>();

		lhmap.put("Bangalore", 1);
		lhmap.put("Hydrabad", 2);
		lhmap.put("Chennai", 3);
		lhmap.put("Pune", 4);
		lhmap.put("Mumbai", 5);
		lhmap.put("Bangalore", 6);
		
		for (Map.Entry<String, Integer> me : lhmap.entrySet()) {
			System.out.println(me.getKey() + ": " + me.getValue());
		}
	}

}
