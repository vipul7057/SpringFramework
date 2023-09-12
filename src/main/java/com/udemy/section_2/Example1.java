package com.udemy.section_2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.section_2.beans.Vehicle;
import com.udemy.section_2.config.ProjectConfig;

public class Example1 {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ProjectConfig.class);
	//	BeanFactory config = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		
		
		Vehicle veh =  config.getBean("newVehicle",Vehicle.class);
		System.out.println(veh.getName());
		
		String name = config.getBean(String.class);
		System.out.println(name);
		
		
		Integer num = config.getBean(Integer.class);
		System.out.println(num);

	}

}
