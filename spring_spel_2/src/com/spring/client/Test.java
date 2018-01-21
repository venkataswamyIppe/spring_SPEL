package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.RandomNumberGenerator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		RandomNumberGenerator rng=ac.getBean("randomNumberGenerator",RandomNumberGenerator.class);
		System.out.println("randomNumber :"+rng.getRandomNumber());
		System.out.println("PI value:"+rng.getPi());
	}

}
