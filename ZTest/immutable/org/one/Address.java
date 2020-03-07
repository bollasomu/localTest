package org.one;

public class Address implements Cloneable{

	private String doorNo;
	private String city;
	private String state;
	private String country;
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
}
