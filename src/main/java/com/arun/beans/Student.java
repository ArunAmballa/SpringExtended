package com.arun.beans;

public class Student 
{
	
	private Integer id;
	private String name;
	private String address;
	
	
	static
	{
		System.out.println("Student class is Loaded");
	}
	
	
	
	public Student(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		
		System.out.println("Student Object is Created");
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
