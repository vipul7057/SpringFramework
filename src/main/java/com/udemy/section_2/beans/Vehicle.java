package com.udemy.section_2.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Vehicle() {
		super();
		
	}
	
	public String printMethod() {
		return "Inside Vehicle";
	}
	

}
