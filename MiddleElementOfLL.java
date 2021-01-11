package Linkedlist;

import java.util.*;

public class MiddleElementOfLL {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;
		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}
	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;
		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}
		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}
			this.tail = node;
		}
	}

	static void printMidElement(SinglyLinkedListNode head) {
		//write your code here
		SinglyLinkedListNode slowPointer, fastPointer; 
		slowPointer = fastPointer = head; 
		if(head !=null) {  
			while(fastPointer != null && fastPointer.next != null) { 
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next.next; 
			} 
			System.out.println(slowPointer.data);
		} 
		
		 
}



public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	while (testCases-- > 0) {
		SinglyLinkedList llist = new SinglyLinkedList();
		int llistCount = scanner.nextInt();
		for (int i = 0; i < llistCount; i++) {
			int llistItem = scanner.nextInt();
			llist.insertNode(llistItem);
		}
		printMidElement(llist.head);
	}
	scanner.close();
	}
}

