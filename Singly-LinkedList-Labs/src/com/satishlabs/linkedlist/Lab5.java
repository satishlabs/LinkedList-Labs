package com.satishlabs.linkedlist;

//Insert the Node at the last of LinkedList

public class Lab5 {

	public static void main(String[] args) {
		Node head = null;
		head = insertLast(head, 10);
		head = insertLast(head, 20);
		head = insertLast(head, 30);
		head = insertLast(head, 40);
		head = insertLast(head, 50);
		displayList(head);
	}

	private static void displayList(Node headNode) {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.print("[" + currentNode.data + "]" + "->\t");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}

	static Node insertLast(Node headNode, int data) {
		Node temp = new Node(data);
		if (headNode == null) {
			return temp;
		}

		// To Reach the Last node of LinkedList
		Node currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = temp;
		return headNode;
	}
}

//Time = O(1)
//Space = O(1)