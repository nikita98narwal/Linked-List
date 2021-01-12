package Linkedlist;
import java.io.*;
import java.util.*;

public class RemoveDuplicate {
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

		// Complete the removeDuplicates function below.

		/*
		For your reference:

		SinglyLinkedListNode {
		 int data;
		SinglyLinkedListNode next;
		}
		To create a new node use below constructor
		public SinglyLinkedListNode(int nodeData)
		*/
		static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
		        //write your code here
		        if (head == null) {
		            return null;
		        }
		 
		        SinglyLinkedListNode current = head;
		 
		        while (current.next != null)
		        {
		            if (current.data == current.next.data)
		            {
		                SinglyLinkedListNode nextNext = current.next.next;
		                current.next = nextNext;
		            }
		            else {
		                current = current.next; 
		            }
		        }
		 
		        return head;
		}


		private static final Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) throws IOException {
		int testCases = scanner.nextInt();
		while (testCases-- > 0) {
		SinglyLinkedList llist = new SinglyLinkedList();

		int llistCount = scanner.nextInt();

		for (int i = 0; i < llistCount; i++) {
		    int llistItem = scanner.nextInt();

		    llist.insertNode(llistItem);
		}
		printLinkedList(removeDuplicates(llist.head));
		}
		scanner.close();
		}

}
