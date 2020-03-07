package org.ds.queue;

public class RunnerQueue {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.show();
		System.out.println();
		System.out.println("deQueue "+ queue.deQueue());
		System.out.println("deQueue "+ queue.deQueue());
		queue.show();
		
	}
}
