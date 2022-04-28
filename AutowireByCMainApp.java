package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByCMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		AutowireByCHuman ob=(AutowireByCHuman) ctx.getBean("humanobj");
		ob.humanFunction();

	}

}
