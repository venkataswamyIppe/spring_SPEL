package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.TelephoneDirectoryAccessor;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		TelephoneDirectoryAccessor tda = ac.getBean("telephoneDirectoryAccessor", TelephoneDirectoryAccessor.class);
		System.out.println("venkat phone number :"+tda.getTelephoneNumber());
	}
}
