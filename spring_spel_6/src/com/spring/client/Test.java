package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;
import com.spring.model.StudentListAccessor;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		StudentListAccessor slv = ac.getBean("studentListAccessor", StudentListAccessor.class);
		System.out.println("Third Student in List");
		System.out.println("----------------------------");
		Student std = slv.getThirdStudentInList();
		System.out.println("student name " + std.getName() + " and marks " + std.getMarks());
		System.out.println("----------------------------");
		System.out.println("List of Student Names ");
		System.out.println("----------------------------");
		List<String>stuList=slv.getStudentNames();
		for(String name:stuList){
			System.out.println("student name " + name);
		}
		System.out.println("----------------------------");
		System.out.println("Failed Student Information");
		System.out.println("----------------------------");
		List<Student>failedStuList=slv.getFailedStudents();
		for(Student st:failedStuList){
			System.out.println("student name " + st.getName() + " and " + st.getMarks());
		}
	}

}
