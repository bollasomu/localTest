package org.lambda;

import java.util.function.Predicate;

public class LambdaEx1 {
	
	public static void alternativeRun() {
		
		System.out.println("Inside alternativeRun() Method : ");
	}
	
	
	public static void main(String[] args) {
		
		FunService f = (a,b)-> a+b;
		System.out.println("addition " + f.m1(10,10));
		
		FunService f2 = (x,y)-> x*y;		
		System.out.println("multiplication "+ f2.m1(10,10));
		
		
		FInterface2 fun = n->n*n;		
		System.out.println("Squre fun " + fun.squreIt(7));		
		
		
		Runnable r = LambdaEx1::alternativeRun;
		Thread t1 = new Thread(r);
		t1.start();
		
		Predicate<String> p1 = UtilityMethods::test2;
		System.out.println(p1.test("hari"));
		
		
	}

}
