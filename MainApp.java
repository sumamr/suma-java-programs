package com.edu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
			public static void main(String[] args)
			{
			//get the object
				ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
				     Employee e1=(Employee) ctx.getBean("empobj");
				     e1.display();
				     
				     Employee e2=(Employee) ctx.getBean("empobj1");
				     e2.display();
				     
				     Employee e3=(Employee) ctx.getBean("empobj2");
				     e3.display();
				    
			}

		}




