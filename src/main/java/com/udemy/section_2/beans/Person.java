package com.udemy.section_2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name = "Vipul";
	private Vehicle vehicle;
	
	
	@Autowired 
	public Person(Vehicle vehicle) {
		
		System.out.println("Vehicle Created inside person");
		this.vehicle = vehicle;
	}
	
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
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}
	

	
	

}
