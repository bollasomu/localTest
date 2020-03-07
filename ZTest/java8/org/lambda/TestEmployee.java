package org.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

	private String name;
	private int salary;
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}




public class TestEmployee {

	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee("hari",5000),new Employee("somu",10000));
		//employees = employees.stream().map(Employee::ge).collect(Collectors.toList());
		
	}
}
