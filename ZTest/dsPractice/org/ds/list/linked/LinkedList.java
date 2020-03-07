package org.ds.list.linked;

import org.ds.list.Node;

public class LinkedList {



	private Node createNode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		return node;
	}

	public Node add(Node node , int data) {

		if(node==null) {
			return createNode(data);
		}
		node.next = add(node.next,data);
		return node;
	}


	public Node reverseLinkedList(Node node) {
		
		if(node == null || node.next == null) {
			return node;
		}
		
		Node temp = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return temp;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		Node head = null;
		
		head = list.add(head, 10);
		head = list.add(head, 20);
		//head = list.add(head, 30);
		//head = list.add(head, 40);
		//head = list.add(head, 50);
		
		System.out.println("Linked List");
		list.printList(head);
		
		System.out.println("\nReverse Linked List");
		Node reverseList = list.reverse(head);
		list.printList(reverseList);
		
		
		System.out.println("\nnew print() method ");
		list.showLinkedList(reverseList);
		 
	}

	private void showLinkedList(Node node){
		
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public Node reverse(Node node) 
	    { 
	        Node prev = null; 
	        Node current = node; 
	        Node next = null; 
	        while (current != null) { 
	           
	        	next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        node = prev; 
	        return node; 
	    } 
	  
	private void printList(Node node){
		if(node==null) {
			return;
		}
		System.out.print(node.data + " ");
		printList(node.next);
	}

}

