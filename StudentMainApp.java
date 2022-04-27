package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainApp {

	public static void main(String[] args) {
		//LOAD THE SPRING.XML FILE
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		StudentSpring s=(StudentSpring) ctx.getBean("sob");
		s.display();

	}

}
