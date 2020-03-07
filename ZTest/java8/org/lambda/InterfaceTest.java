package org.lambda;


interface A{
	
	public void m1();
}
interface B{
	public void m1();
}
public class InterfaceTest implements A,B {

	@Override
	public void m1() {
		
		System.out.println("Inside m1() method ");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceTest a1 = new InterfaceTest();
		B b1 = new InterfaceTest();
		
		System.out.println("a1 " + a1.getClass().getSuperclass());
		
		
		a1.m1();
		b1.m1();
	}

	
}
