package com.fis.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Car;

public class MainRunner {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");

		Car car2 = (Car) spring.getBean("carNewCar2");
		car2.setCarName("Wagon-R");
		System.out.println("First Call :- " + car2);


		spring.close();

	}
}
