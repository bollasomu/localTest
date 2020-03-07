package org.caller;

public class TestClass implements TI{

	
	public void test() {
		
		String callingClassName = Thread.currentThread().getStackTrace()[2].getClassName();
		
		for(int i=0;i<Thread.currentThread().getStackTrace().length;i++) {
			
			System.out.println("values :" + i +"    " + Thread.currentThread().getStackTrace()[i]);
		}
		System.out.println(callingClassName);
		
		
	}
	
	private void m1(SRItemAnalysisDetail srItemAnalysisDetail,String className) {
		
		/*
		 * String callerClassName = new Exception().getStackTrace()[1].getClassName();
		 * //String calleeClassName = new Exception().getStackTrace()[0].getClassName();
		 * 
		 * 
		 * System.out.println("callerClassName = "+ callerClassName);
		 * 
		 * System.out.println("3 rd way : "+ Thread.currentThread().getStackTrace()[2]);
		 */
		
		//String callingClassName = Thread.currentThread().getStackTrace()[2].getClassName();
		
		if(className.contains("A")) {
			System.out.println("A class");
			srItemAnalysisDetail.setClassName("A");
		}
		
		
		System.out.println("================================");

	}
	public static void main(String[] args) {
		
		
	}
}
