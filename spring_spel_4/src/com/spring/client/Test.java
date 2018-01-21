package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.ExaminationResult;
import com.spring.model.MarkSheet;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		ExaminationResult er=ac.getBean("examinationResult",ExaminationResult.class);
		System.out.println(er.isHasPassed());
		System.out.println("reslut message :"+er.getResultMsg());
	}

}
