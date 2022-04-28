package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpellChkMainApp {

	public static void main(String[] args) {
		//1.byName Annotation
		/*ApplicationContext ctx=new  ClassPathXmlApplicationContext("spring.xml");
		TextEditor tx=(TextEditor) ctx.getBean("textobj");
		tx.textFunction();
       */
		 
		//2.byType Annotation 
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		TextEditor tx1=(TextEditor) ctx.getBean("textobj1");
		tx1.textFunction();
		*/
		
		
		//3.by constructor Annotation
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		TextEditor tx2=(TextEditor) ctx.getBean("textobj2");
		tx2.TextFun();
		*/
		
		//4.by referencing
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		TextEditor tx3=(TextEditor) ctx.getBean("textobj");
		tx3.textFun();
	}

}
