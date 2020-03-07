package org.ds.queue;

public class Queue {

	int[] queue = new int[5];
	int front;
	int rear;
	int size;
	
	public void enQueue(int data) {
		
		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}
	
	public int deQueue() {
		
		int data = queue[front];
		front = front + 1;
		size = size - 1;
		
		return data;
	}
	
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[i+front] + " ");
		}
	}
	
}
