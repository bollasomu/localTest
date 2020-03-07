package org.one;

import java.util.Calendar;

public class StudentTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(1991, 01, 12);
		
		Address hariAddress = new Address();
		hariAddress.setDoorNo("123/A");
		hariAddress.setCity("Bangalore");
		hariAddress.setState("Karnataka");
		hariAddress.setCountry("India");
		
		Student hari = new Student("hari", 1, hariAddress, cal.getTime());
		
		System.out.println("Before changing Hari object :  \n" + hari);
		
		
		
		hari.getAddress().setCity("HYDERABAD");
		
		hari.getDob().setDate(14);
		hari.getDob().setYear(1992);
		hari.getDob().setMonth(02);
		
		System.out.println("After changing Hari object :  \n" + hari);
		
		

	}

}
