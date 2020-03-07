package org.test3;

import java.util.Arrays;
import java.util.List;



public class CustomerSort {
	
	
	public static void main(String[] args) {
		
		List<Customer> customers = Arrays.asList(new Customer(5,"Eshwar",1,"hyderabad"),
				new Customer(4,"Zhaah",2,"bangalore"),
				new Customer(3,"Ususu",3,"pune"),
				new Customer(2,"Deera",4,"chennai"),
				new Customer(1,"Abhi",5,"vizag"));
		
		customers.sort((Customer c1, Customer c2)->c2.getAge() - c1.getAge());
		
		customers.forEach(customer -> System.out.println(customer));
		
		System.out.println("sorting names : ");
		customers.sort((Customer c1, Customer c2)->c1.getName().compareTo(c2.getName()));
		customers.forEach(customer -> System.out.println(customer));
		
		customers.toArray();
		
		
		/*
		 * Collections.sort(customers);
		 * 
		 * customers.forEach(customer -> System.out.println(customer));
		 * 
		 * SortingMethods.sortByAge(customers);
		 * 
		 * System.out.println("sorting based on Age : "); customers.forEach(customer ->
		 * System.out.println(customer));
		 */
		
	}
}

