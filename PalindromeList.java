import java.io.*;
import java.util.*;
public class Main{
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

// Complete the palindromeLlist function below.
/*
For your reference:

public SinglyLinkedListNode {
int data;
SinglyLinkedListNode next;
}

To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/

static boolean palindromeLlist(SinglyLinkedListNode head) {
//write your code here
SinglyLinkedListNode slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
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
boolean res =palindromeLlist(llist.head);
if(res)
System.out.println("true");
else
    System.out.println("false");
}
scanner.close();
}
}