package com.java.project.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Orange");
		set.add("Guva");
		set.add("Apple");

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// or
		for (String s : set) {
			System.out.println(s);
			// set.remove("Guva"); ConcurrentModificationException
		}

		// If you want to preserve the insertion order and remove duplicates use
		// LinkedHashSet.
		Set<String> lset = new LinkedHashSet<>();
		lset.add("Apple");
		lset.add("Orange");
		lset.add("Guva");
		lset.add("Apple");
		for (String s : lset) {
			System.out.println(s);
			// set.remove("Guva"); ConcurrentModificationException
		}
		// If i want to sort the data then we use TreeSet
		Set<String> tset = new TreeSet<>();
		tset.add("Apple");
		tset.add("Orange");
		tset.add("Guva");
		tset.add("Apple");
		for (String s : tset) {
			System.out.println(s);
			// set.remove("Guva"); ConcurrentModificationException
		}
		System.out.println("Functional Programming");
		set.stream().forEach(e->System.out.println(e));
	}

}
