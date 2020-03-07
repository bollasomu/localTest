package org.list;

public class LinkedList {

	Node head;
	
	public void add(int data) {
		
		Node node = new Node();
		node.data = data;
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
	
	public void middleElement() {
		
		Node fastPtr = head;
		Node slowPtr = head;
		
		while(fastPtr.next!=null && fastPtr.next.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		
		System.out.println("\nMiddle Element is : "+ slowPtr.data);
	}
	
	public void printList() {
		
		Node node = head;
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
