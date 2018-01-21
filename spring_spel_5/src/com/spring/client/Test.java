package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.EmailValidator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		EmailValidator ev=ac.getBean("emailValidator",EmailValidator.class);
		System.out.println("email id validation result is :"+ev.getIsValidEmail());
	}

}
