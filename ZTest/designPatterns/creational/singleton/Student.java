package creational.singleton;

public class Student {

	//private static final Student student = new Student(); eager initialization
	private static Student student; 	
	
	private Student() {
		
	}
	public static Student getSutdent() {
		//return student; // eager
		
		if(student == null) {
			student = new Student();
		}
		return student;
		
	}
}
