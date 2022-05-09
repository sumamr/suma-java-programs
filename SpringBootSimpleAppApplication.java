package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSimpleAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringBootSimpleAppApplication.class, args);
		Student sob=context.getBean(Student.class);
		sob.display();
		Course cob=context.getBean(Course.class);
		cob.courseDisplay();
	}

}
