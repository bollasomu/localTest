package creational.singleton;

public class SingleTonTest {

	
	public static void main(String[] args) {
		
		Student s1 = Student.getSutdent();
		System.out.println(s1);
		
		Student s2 = Student.getSutdent();
		System.out.println(s2);
		
		Student s3 = Student.getSutdent();
		System.out.println(s3);
		
		
		System.out.println("\n*******************");
		
		Employee e1 = Employee.getEmployee();
		Employee e2 = Employee.getEmployee();
		Employee e3 = Employee.getEmployee();
		
		System.out.println(e1 + " "+ e2 + " "+ e3);
		
		
	}
}
