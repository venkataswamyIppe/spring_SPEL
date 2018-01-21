package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
import com.spring.model.BookLibrary;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		BookLibrary bl = ac.getBean("bookLibrary", BookLibrary.class);
		List<Book> allBooks = bl.getAllBooks();
		for (Book book : allBooks) {
			System.out.println("book id is " + book.getBookId() + " and book name is " + book.getBookName());
		}
		System.out.println("===========================================");
		Book book = bl.getGetFirstBook();
		System.out.println("book id is " + book.getBookId() + " and book name is " + book.getBookName());
	}

}
