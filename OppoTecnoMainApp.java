package com.edu;


//Annotation based configuration
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OppoTecnoMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		TecnoSpark5 t=ctx.getBean(TecnoSpark5.class);
		t.tecnoFun();

		
	}

}
