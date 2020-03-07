package org.ds.list;

public class TExample implements Runnable{

	@Override
	public void run() {
		System.out.println("hello");
		
	}
	
	public static void main(String[] args) {
		
		TExample obj = new TExample();
		Thread t1 = new Thread(obj);
		t1.run();
		t1.start();
	}
	

}
