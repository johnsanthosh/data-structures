package com.exj.linkedlist;

public class LinkedList {
	Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		head = null;
	}

	/**
	 * Inserts a node at the beginning of the linked list.
	 * 
	 * @param head
	 * @param data
	 */
	public void insertAtBeg(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			node.next = null;
		} else {
			node.next = head;
			head = node;
		}

	}

	/**
	 * Prints the list elements.
	 * 
	 * @param head
	 */
	public void display() {
		Node start = head;
		System.out.println("The elements in the linkedlist : ");
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
}
