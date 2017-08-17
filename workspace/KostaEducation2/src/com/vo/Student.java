package com.vo;

public class Student {
	private String name;
	private int age;
	private String address;
	private int[] attendances;
	
	public Student(String name, int age, String address, int[] attendances) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.attendances = attendances;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int[] getAttendances() {
		return attendances;
	}

	public void setAttendances(int[] attendances) {
		this.attendances = attendances;
	}
	
	
}
