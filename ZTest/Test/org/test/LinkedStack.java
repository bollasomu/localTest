package org.test;

import org.ds.list.linked.Node;

public class LinkedStack {
	
	Node head;
	
	public void push(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = head;
		
		
		head = node;
	}

	public void show() {
		
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public int peek() {
		
		return head.data;
	}
	
	public int pop() {
		
		int data = head.data;
		head = head.next;
		return data;
	}
}

