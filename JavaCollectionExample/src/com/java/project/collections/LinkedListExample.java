package com.java.project.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String args[]) {
		// Creating object of the
		// class linked list
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		ll.add("Z");

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);

		ListIterator<String> lt = ll.listIterator(ll.size());

		while (lt.hasNext()) {
			System.out.println(lt.next());
		}

		while (lt.hasPrevious()) {
			System.out.print(lt.previous() + " ");
		}
	}
}
