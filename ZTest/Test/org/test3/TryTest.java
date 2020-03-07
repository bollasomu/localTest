package org.test3;

public class TryTest {
	
	
	public static int m1() {
		try {
			int i =10/0;
			return 10;
		}catch (Exception e) {
			return 20;
		}finally {
			return 30;
		}
		//return 40;
	}

	public static void main(String[] args) {
		
		System.out.println(m1());
		
		
	}
}
