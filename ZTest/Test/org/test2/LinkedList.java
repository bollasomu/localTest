package org.test2;

import org.ds.list.linked.Node;

public class LinkedList {

	Node head;

	public void push(int data) {
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

}
