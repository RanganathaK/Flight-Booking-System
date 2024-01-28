package com.demo;


public class Passengers {

	String name;
	
	int age;
	
	String gender;
	
	String dateOfBirth;
	
	long mobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Passengers(String name, int age, String gender, long mobileNo, String dateOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
