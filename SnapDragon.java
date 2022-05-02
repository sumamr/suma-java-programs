package com.edu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SnapDragon implements MobileProcessor {

	public void Processor() {
		System.out.println("SnapDragon Run");
		
		
	}
	

}
