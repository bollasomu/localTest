package org.one;

import java.util.Date;

public final class Student {

	private final String name;
	private final int rollno;
	
	private final Address address;
	private final Date dob;
	
	public Student(String name, int rollno, Address address, Date dob) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public Address getAddress() {
		Address newAddress = new Address();
		newAddress.setCity(address.getCity());
		newAddress.setCountry(address.getCountry());
		newAddress.setDoorNo(address.getDoorNo());
		newAddress.setState(address.getState());
		
		return newAddress;
	}

	public Date getDob() {
		return (Date) dob.clone();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + ", dob=" + dob + "]";
	}	
	
	
}
