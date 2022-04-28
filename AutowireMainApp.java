package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		AutowireHuman ob=(AutowireHuman) ctx.getBean("humanobj");
		ob.humanFunction();

	}

}
