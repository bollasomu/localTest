package creational.singleton;

public class Employee {

	private Employee() {
		
	}
	
	private static class EmployeeHelper{
		private static final Employee EMPLOYEE = new Employee();
	}
	
	public static Employee getEmployee() {
		return EmployeeHelper.EMPLOYEE;
	}
}
