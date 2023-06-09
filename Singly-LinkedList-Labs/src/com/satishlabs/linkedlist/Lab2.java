package com.satishlabs.linkedlist;

//Traverse the LinkedList using Recursive style

public class Lab2 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		displayList(head);
	}

	private static void displayList(Node headNode) {
		// Base Condition
		if (headNode == null)
			return;

		System.out.print("[" + headNode.data + "]" + "\t");
		displayList(headNode.next);
		
		System.out.println("\n");
	}
}
