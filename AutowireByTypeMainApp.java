package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByTypeMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		AutowireByTypeHuman ob= (AutowireByTypeHuman) ctx.getBean("humanobj");
		ob.humanFunction();

	}

}
