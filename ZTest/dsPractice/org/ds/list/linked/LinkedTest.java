package org.ds.list.linked;

public class LinkedTest {

	static Node head;
	
	public void insertNode(int value) {
		
		Node node = new Node();
		node.data = value;
		node.next = null;
		
		if(head == null) {
			head = node;
		} else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
		
	}
	public static void main(String[] args) {
		
		
		LinkedTest linkedList = new LinkedTest();
		linkedList.insertNode(10);
		linkedList.insertNode(20);
		linkedList.insertNode(30);
		linkedList.insertNode(40);
		linkedList.insertNode(50);
		
		System.out.println("Linked List ");
		printList(head);
		
		System.out.println("\n\n*** insert 2nd position **** ");
		insertAtPosition(101,2);

		printList(head);
		
		Node reverseList = reverseNode(head);
		System.out.println("\n\nReverse List ");
		printList(reverseList);
		
		
		
	}
	
	
	public static Node reverseNode(Node node) {
		
		Node next = null;
		Node prev = null;
		Node current = node;
		
		while(current!=null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	
	private static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + "  ");
			node = node.next;
		}
	}
	
	
	public static void insertAtPosition(int data, int index) {
		
		Node n = head;
		
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		Node node = new Node();
		node.data = data;
		
		node.next = n.next;
		n.next = node;
		
	}
}
