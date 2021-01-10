package Linkedlist;
public class LinkedList {
		class Node{
			int data;
			Node next;
			
			Node(int data){  //cunstructor
				this.data = data;
				this.next = null;
			}
		}
		
		Node head = null;
		
		public void InsertBeg(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			System.out.println(head.data);
		}
		
		public void insertEnd(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
			}
			else {
				Node tempNode = head;
				while(tempNode.next != null) {
					tempNode = tempNode.next;
				}
				tempNode.next = newNode;
			}
		}
		
		
		public void InsertBetween(int num, int data) {
			Node tempNode = head;
			while(tempNode != null && tempNode.data != num) {
				tempNode = tempNode.next;
			}
			Node newNode = new Node(data);
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			
		}
		
		public void printList() {
			Node tempNode = head;
			while(tempNode != null) {
				System.out.print(tempNode.data +" ");
				tempNode = tempNode.next;
			}
			System.out.println();
		}

		public static void main(String[] args) {
			
			LinkedList insert = new LinkedList();
			insert.InsertBeg(9);
			insert.InsertBeg(7);
			insert.InsertBeg(6);
			insert.printList();
			insert.insertEnd(10);
			insert.InsertBetween(7, 8);
			insert.printList();
		}
	}
