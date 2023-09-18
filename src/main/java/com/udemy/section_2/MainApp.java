package com.udemy.section_2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.section_2.beans.Person;
import com.udemy.section_2.beans.Vehicle;
import com.udemy.section_2.config.ProjectConfig;

public class MainApp {

	public static void main(String[] args) {

		// XML File Bean Creation
		/*
		 * ApplicationContext config = new ClassPathXmlApplicationContext("beans.xml");
		 * Vehicle veh = (Vehicle)config.getBean("vehicle");
		 * System.out.println(veh.getName());
		 */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		System.out.println("Before Creating Person by Spring");
		Person person = context.getBean(Person.class);
		Vehicle vehicle = context.getBean(Vehicle.class);

		
		System.out.println();
		System.out.println("Person name from Spring Context is: " + person.getName());
		System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
		System.out.println("Vehicle that Person own is: " + person.getVehicle());

		/*
		 * 
		 * 
		 * 
		 * AnnotationConfigApplicationContext config = new
		 * AnnotationConfigApplicationContext(ProjectConfig.class); Vehicle veh =
		 * config.getBean(Vehicle.class); System.out.println(veh.getName());
		 * System.out.println(veh.printMethod()); config.close();
		 * 
		 * 
		 * 
		 */

		/*
		 * When dependency created without using annotations.
		 * 
		 * Vehicle veh = config.getBean("newVehicle",Vehicle.class);
		 * System.out.println(veh.getName());
		 * 
		 * String name = config.getBean(String.class); System.out.println(name);
		 * 
		 * Integer num = config.getBean(Integer.class); System.out.println(num);
		 */
	}

}
