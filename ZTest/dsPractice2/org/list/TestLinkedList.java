package org.list;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.printList();
		
		//Middle element
		list.middleElement();
	}

}
