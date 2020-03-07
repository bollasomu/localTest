package org.lambda;

@FunctionalInterface
public interface FunService {
	
	public abstract int m1(int a,int b);

	
	default void m2() {
		System.out.println("default m2() method in FunService interface ");
	}
	
	public static void m3() {
		System.out.println("static m3() method ");
	}
	
	default void m4() {
		System.out.println("default m2() method in FunService interface ");
	}
	

}
