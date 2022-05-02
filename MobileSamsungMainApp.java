package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileSamsungMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Samsung sob=ctx.getBean(Samsung.class);
		sob.MobileConfig();
		

	}

}
