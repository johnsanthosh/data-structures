package com.exj.linkedlist;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * @author johns
 *
 */
public class SortList {
	public static Node sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node prev = null;
		Node slow = head;
		Node fast = head;
		// Partitions the list into two parts.
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = null;

		// Sorts each half separately.
		Node a = sort(head);
		Node b = sort(slow);

		// Merge the sorted lists.
		return merge(a, b);

	}

	public static Node merge(Node a, Node b) {
		Node l = new Node(0);
		Node p = l;

		while (a != null && b != null) {
			if (a.data < b.data) {
				p.next = a;
				p = p.next;
				a = a.next;
			} else {
				p.next = b;
				p = p.next;

				b = b.next;
			}
		}

		while (a != null) {
			p.next = a;
			p = p.next;
			a = a.next;
		}

		while (b != null) {
			p.next = b;
			p = p.next;
			b = b.next;
		}

		return l.next;

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBeg(1);
		list.insertAtBeg(2);
		list.insertAtBeg(3);
		list.insertAtBeg(4);
		list.insertAtBeg(5);

		list.setHead(SortList.sort(list.getHead()));

		list.display();
	}
}
