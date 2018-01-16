package com.exj.linkedlist;

public class ReverseList {
	/**
	 * Reverses the entire list.
	 * 
	 * @param head
	 * @return
	 */
	public static Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node reversedList = reverse(head.next);
		head.next.next = head;
		head.next = null;

		return reversedList;
	}

	/**
	 * Reverses the second half of the list.
	 * @param head
	 * @return
	 */
	public static void reverseSecondHalf(Node head) {
		Node slow = head;
	    Node fast = head;
	    Node prev = null;
	   
	    while(fast!=null && fast.next!=null){
	        prev = slow;
	    	slow = slow.next;
	        fast=fast.next.next;
	    }
	   
	    //Even number of elements.
	    if(fast == null){
	        prev.next = reverse(slow);
	    //Odd number of elements.
	    }else{
	        prev.next.next =  reverse(slow.next);
	    }
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBeg(1);
		list.insertAtBeg(10);
		list.insertAtBeg(3);
		list.insertAtBeg(8);
		list.insertAtBeg(5);

		ReverseList.reverseSecondHalf(list.getHead());
		list.display();
	}
}
