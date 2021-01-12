package Linkedlist;

import java.util.Scanner;

public class InsertSortedLL {
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

		static SinglyLinkedListNode insertSortedNode(SinglyLinkedListNode head,int value) {
		   
			SinglyLinkedListNode prev=head,curr=head;
		    if(head.data>value){
		    	SinglyLinkedListNode temp=new SinglyLinkedListNode(value);
		        temp.next=head;
		        return temp;
		    }
		    while(curr!=null){
		        prev=curr;
		        curr=curr.next;
		        SinglyLinkedListNode temp=new SinglyLinkedListNode(value);
		        if(prev.data<=value&&curr!=null&&curr.data>=value){
		            temp.next=curr;
		            prev.next=temp;
		            return head;
		        }
		        else if(curr==null&&prev.data<=value){
		        prev.next=temp;
		        return head;
		        }
		    }
		    return head;
		}				 


		 
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int testCases = scanner.nextInt();
		while (testCases-- > 0) {
		SinglyLinkedList llist = new SinglyLinkedList();
		int llistCount = scanner.nextInt();
		for (int i = 0; i < llistCount; i++) {
		    int llistItem = scanner.nextInt();
		    llist.insertNode(llistItem);
		}
		int value= scanner.nextInt();
		printLinkedList(insertSortedNode(llist.head,value));
		}
		scanner.close();
		}


}
