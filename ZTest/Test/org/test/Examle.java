package org.test;


class Super{
	
	public int i;
	protected  int j;
}
class Sub extends Super{
	
	int j;
	
	public void dispaly() {
		
		super.i=10;
		super.j=20;
		System.out.println(i + "======> "+ j);
	}
}
class Test{
	
	int value ;
}
public class Examle {
	
	int a = 100;
	static int x = 0;
	
	Examle(){
		x++;
	}

	public static void main(String[] args) {
		
		final Test t = new Test();
		t.value=900;
		System.out.println("T value " + t.value);
		
		Examle e1 = new Examle();
		Examle e2 = new Examle();
		Examle e3 = new Examle();
		
		int a = 9;
		
		System.out.println("Total "+ x +" objects created");
		
		Sub s = new Sub();
		s.i=100;
		s.j=200;
		s.dispaly();
		
		e1.print();
		
		int g = 3;
		System.out.println(g++ * 8);
		
		
		String str = "I love india";
		System.out.println("Index of " + str.indexOf('i'));
		
	}
	public void print() {
		System.out.println(a);
	}
}

