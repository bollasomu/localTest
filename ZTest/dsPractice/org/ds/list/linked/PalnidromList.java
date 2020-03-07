package org.ds.list.linked;

import java.util.Stack;

public class PalnidromList {

	static Node head;

	public static void add(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {

			Node n = head;

			while (n.next != null) {
				
				n = n.next;
			}
			n.next = node;
		}
	}

	static void printList(Node node) {
		
		Node n = node;
		while(n!=null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	public static void main(String[] args) {

		add(10); add(20); add(30); add(30); add(20); add(10);
		printList(head);	
		
		//palindrom Linked list
		palindromList();
	}
	
	static void palindromList() {
		
		
		Node slowPtr = head;
		Node fastPtr = head;
		
		Stack<Node> stack = new Stack<>();
		stack.push(slowPtr);
		
		while(fastPtr.next!=null && fastPtr.next.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			stack.push(slowPtr);
		}
		
		if(fastPtr.next ==null) {
			stack.pop();
		}
		
		Node secondHalf = slowPtr.next;
		
		boolean isLinkedListPalindrom = true;
		
		while(secondHalf!=null) {
			
			if(stack.pop().data!=secondHalf.data) {
				isLinkedListPalindrom = false;
				break;
			}
			secondHalf = secondHalf.next;
			
		}
		System.out.println("\n Is Linked lis is Palindrom ?  "+ isLinkedListPalindrom);
		
		
		
		
	}
}
