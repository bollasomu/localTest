package org.ds.stack;

public class Stack {
	
	int[] stack = new int[5];
	int top;
	
	public void push(int data) {
		stack[top] = data;
		top++;
	}
	
	public int pop() {
		top = top - 1;
		int result = stack[top];
		
		return result;
	}
	
	public void show() {
		for(int i=0;i<top;i++) {
			System.out.print(stack[i] + " ");
		}
	}

}
