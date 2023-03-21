package com.satishlabs.linkedlist;

//Insert the Node at the begining of LinkedList

public class Lab4 {

	public static void main(String[] args) {
		Node head = null;
		head = insertFirst(head, 10);
		head = insertFirst(head, 20);
		head = insertFirst(head, 30);
		head = insertFirst(head, 40);
		head = insertFirst(head, 50);
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
	
	static Node insertFirst(Node headNode,int data) {
		Node temp = new Node(data);
		temp.next = headNode;
		return temp;
	}
}

//Time = O(1)
//Space = O(1)