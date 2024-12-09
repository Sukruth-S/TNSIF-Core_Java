package com.tnsif.inheritance.singlelevel;

public class Citizen {

	private String name;
	private long aadharNo;
	private String city;
	private long phNo;
	
	
	
	public Citizen() {
		
	}

	public Citizen(String name, long aadharNo, String city, long phNo) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.city = city;
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
	
	
	
}
