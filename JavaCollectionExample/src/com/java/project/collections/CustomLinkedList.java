package com.java.project.collections;

import java.util.ListIterator;

class Node<T> {
	T data;
	Node next;

	public Node(T data) {
		this.data = data;
	}
}

public class CustomLinkedList<T> {
	Node head; // Reference to the first node in the linked list (head)

	// Method to add a new node with specified data to the list
	public void add(T data) {
		// Create a new node with the given data
		Node newNode = new Node(data);

		// If the list is empty (head is null), make the new node the head
		if (head == null) {
			head = newNode;
		} else {
			// If the list is not empty, traverse to the last node
			Node current = head;

			// Traverse the list until the last node (where current.next is null)

			while (current.next != null) {
				current = current.next;
			}

			// Set the next of the last node to the new node (adding it at the end)
			current.next = newNode;
		}
	}

	// Method to print the elements of the linked list
	public void print() {
		// Start from the head node
		Node current = head;

		// Traverse the list and print each node's data
		while (current != null) {
			System.out.print(current.data + "->"); // Print the current node's data followed by '->' to indicate the
													// link
			current = current.next; // Move to the next node in the list
		}

		System.out.print("null"); // Print 'null' to indicate the end of the list
	}

	// Main method to test the linked list implementation
	public static void main(String args[]) {
		// Create an instance of CustomLinkedListExample
		CustomLinkedList list = new CustomLinkedList();

		// Add elements to the linked list
		list.add("abc"); // Add abc to the list
		list.add(20); // Add 20 to the list
		list.add(30); // Add 30 to the list

		list.print(); // Print the elements of the list
		

	}

}
