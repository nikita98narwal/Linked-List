package Linkedlist;

import java.util.Scanner;
	public class LastToFront {
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
	static void printLinkedList(SinglyLinkedListNode head)
	{
	SinglyLinkedListNode temp=head;
	while(temp!=null)
	{
	    System.out.print(temp.data+" ");
	    temp=temp.next;
	}
	System.out.println();
	}

	
	static SinglyLinkedListNode lastElementFirst(SinglyLinkedListNode head) {
	SinglyLinkedListNode slow = null;
	       SinglyLinkedListNode fast = head;
	       if (head == null || head.next==null) {
	           return head;
	       }
	           while (fast.next != null) {
	               slow = fast;
	               fast = fast.next;
	           }
	           slow.next = null;
	           fast.next = head;
	           head = fast;
	        return head;

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
	printLinkedList(lastElementFirst(llist.head));
	}
	scanner.close();
	}
	}