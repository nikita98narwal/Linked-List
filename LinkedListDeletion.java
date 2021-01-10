package Linkedlist;

public class LinkedListDeletion {
	Node head = null;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void Insert(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println(head.data);
	}
	
	public void delete(int num) {
		Node currentNode = head;
		Node prevNode = null;
		
		while(currentNode != null && currentNode.data != num) {
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode == head) {
			if(head == null) {
				System.out.println("Empty list");
				return;
				}
			head = head.next;
			return;
			}
		prevNode.next = currentNode.next;
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
		// TODO Auto-generated method stub
		LinkedListDeletion insert = new LinkedListDeletion();
		insert.Insert(9);
		insert.Insert(7);
		insert.Insert(6);
		insert.printList();
		insert.delete(9);
		insert.printList();
	}
}
