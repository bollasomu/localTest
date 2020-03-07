package org.test3;

public class Customer implements Comparable<Customer>{

	private int id;
	private String name;
	private int age;
	private String city;
	
	public Customer(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	
	@Override
	public int compareTo(Customer c) {
		
		//return this.name.compareTo(c.name);
		//return c.name.compareTo(this.name);
		
		System.out.print("this id "+ this.id);
		System.out.println("  c id "+ c.id);
		
		//return Integer.valueOf(this.id).compareTo(Integer.valueOf(c.id));
	
		if(this.id > c.id) {
			return -1;
		} else
			return 1;
	}

	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}




	public int getAge() {
		return age;
	}




	public String getCity() {
		return city;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	

}
