package com.udemy.section_2.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.BeanDefinition;

@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Vehicle {

	private String name = "i20";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle() {
		System.out.println("vehicle object created by spring");

	}

	public String printMethod() {
		return "Inside Vehicle";
	}

	@PostConstruct
	public void initialize() {
		this.name = "Hondaaa";
	}

	@PreDestroy
	public void destroy() {
		this.name = "None";
		System.out.println("Destroying the Bean");
	}

	public void setVehicle(Vehicle vehicle) {

	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
}
