package com.udemy.section_2.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.section_2.beans.Vehicle;



@ComponentScan(basePackages = "com.udemy.section_2.beans")
@Configuration
public class ProjectConfig {
	
	
	
	
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
