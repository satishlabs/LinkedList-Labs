package com.satishlabs.linkedlist;

//Find the Length of the LinkedList(No of Nodes)

public class Lab3 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		System.out.println(length(head));
	}

	static int length(Node headNode) {
		int length = 0;
		Node curretNode = headNode;
		while (curretNode != null) {
			length++;
			curretNode = curretNode.next;
		}
		return length;
	}
}
