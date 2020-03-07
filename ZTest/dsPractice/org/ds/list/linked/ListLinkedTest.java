package org.ds.list.linked;

public class ListLinkedTest {

	public static Node head;

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

	public static void main(String[] args) {
		// adding elements to the LinkedList
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		printList(head);

		// size of the list
		System.out.println("\nlinked list size : " + getSize(head));
		insertData(2, 70);

		System.out.println("\nNew Node with updated data : ");
		printList(head);

		System.out.println("\n\nHead New Node with updated data : ");
		Node newHead = insertAtStart(100);
		printList(newHead);

		System.out.println("\n\n*********Head New Node with updated data : ");

		printList(head);

		//middle element
		middleElement();
	}

	public static Node insertAtStart(int data) {

		Node node = new Node();
		node.data = data;

		node.next = head;
		head = node;

		return node;

	}

	public static void insertData(int index, int data) {

		Node n = head;

		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}

		Node node = new Node();
		node.data = data;

		node.next = n.next;
		n.next = node;

	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static int getSize(Node node) {
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}
		return size;
	}

	public static void middleElement() {

		Node fastPtr = head;
		Node slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		System.out.println("\n####### middle element is ::::===> "+ slowPtr.data);
	}
	
	
	public void palindromList(Node node) {
		
		
	}
}
