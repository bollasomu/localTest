package org.ds.stack;

public class RunnerStack {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.show();
		System.out.println();
		System.out.println("first pop " + stack.pop());
		System.out.println("second pop " + stack.pop());
		
		stack.show();
		
	}

}
