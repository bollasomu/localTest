package org.test;

public class RunnerLinkedStack {
	
	public static void main(String[] args) {
		
		LinkedStack linkedStack = new LinkedStack();
		linkedStack.push(1);
		linkedStack.push(2);
		
		linkedStack.show();
		System.out.println("peek " + linkedStack.peek());
		
		System.out.println("Pop "+ linkedStack.pop());
		
		linkedStack.show();
	}

}
