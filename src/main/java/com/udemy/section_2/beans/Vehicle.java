package com.udemy.section_2.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


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

	@PostConstruct
	public void initialize() {
		this.name = "Honda";
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying the Bean");
	}

	public void setVehicle(Vehicle vehicle) {
		
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
}
