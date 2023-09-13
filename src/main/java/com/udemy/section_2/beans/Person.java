package com.udemy.section_2.beans;

public class Person {
	
	private String name;
	private Vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}
	
	
	

}
