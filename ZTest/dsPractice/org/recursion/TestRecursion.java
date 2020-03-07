package org.recursion;

public class TestRecursion {

	public static void reduceByOne(int value) {

		if(value > 0) {
			 reduceByOne(value-1);
		}

		int temp = value;
		System.out.println("value : "+ temp);
		
	}

	public static void main(String[] args) {

		reduceByOne(1);
	}
}
