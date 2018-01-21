package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.PerimeterCalculator;
import com.spring.model.Rectangle;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		PerimeterCalculator pc=ac.getBean("perimeterCalculator",PerimeterCalculator.class);
		System.out.println("rectangle perimeter :"+pc.getPerimeter());
	}

}
