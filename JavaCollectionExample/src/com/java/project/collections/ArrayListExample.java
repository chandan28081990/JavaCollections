package com.java.project.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = new ArrayList<>();
		number.add(12);
		number.add(13);
		number.add(15);

		number.add(0, 11);

		Iterator<Integer> it = number.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		number.set(3, 14);

		number.remove(0); // removes 12 in the list

		// Random Access
		System.out.println("using get " + number.get(2));

		for (Integer i : number) {
			// number.remove(i); //We get concurrent exception
			System.out.println(i);
		}

		// number.removeAll(number); //remove all elements are removed in the ArrayList.
	}

}
