package com.udemy.section_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.section_2.beans.Person;
import com.udemy.section_2.beans.Vehicle;



@ComponentScan(basePackages = "com.udemy.section_2.beans")
@Configuration
public class ProjectConfig {
	
	@Bean
	public Vehicle vehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Audi");
		return vehicle;
	}
	
	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("Vipul");
		person.setVehicle(vehicle());
		return person;
	}


	
	
	/*
	 * 
	 * Use below code with the java class is not makred as @Compnent
	 * 
	 * 
	@Bean
	public Vehicle getVeh() {
		Vehicle veh = new Vehicle();
		veh.setName("Audi");
		return veh;
	}

	@Bean(value = "newVehicle")
	public Vehicle getVeh2() {
		Vehicle veh = new Vehicle();
		veh.setName("Audi2");
		return veh;
	}
	
	@Bean
	String hello() {
		return "Hello World";
	}
	
	@Bean
	Integer getNumber() {
		return 10;
	}
	*/
}
