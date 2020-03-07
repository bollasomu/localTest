package org.ds.linked;



public class LinkedList {

	Node head;

	public void addElement(int element) {

		Node node = new Node();
		node.element = element;
		node.next = null;

		if(head==null) {
			head = node;
		} else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;			

		}
	}

	public void show() {

		Node node = head;
		while(node.next!=null) {
			System.out.println(node.element);
			node = node.next;
		}
		System.out.println(node.element);
	}
}
