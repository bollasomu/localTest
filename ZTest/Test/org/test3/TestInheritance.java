package org.test3;

class A{

	void m1() {
		System.out.println("A m1()");
	}
	void m2() {
		System.out.println("A m2()");
	}
}
	class B extends A{

		void m2() {
			System.out.println("B m2()");
		}
	
	  void m3() { System.out.println("B m3()"); }
	
	}


	public class TestInheritance {

		public static void main(String[] args) {
			
			A a1 = new A();
			B b1 = new B();
			
			A a2 = new B();
			//B b2 = (B) new A();
			B b2 = new B();
			
			Object o = new Object();
			
//			String s =  (String) o;
			
			
			
			a1.m1();
			a1.m2();
			
			b1.m1();
			b1.m2();
			b1.m3();
			
			a2.m1();
			a2.m2();
			//a2.m3();
			
			b2.m1();
			b2.m2();
			b2.m3();
			
			A a9 = new B();
			
			B b9 = (B) a9;
			
		}

	
		
	}
