package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TecnoSpark5 {
	@Autowired
//	@Qualifier("snapDragon")
	@Qualifier("oppo")
	MobileProcessor mpt;

	public MobileProcessor getMpt() {
		return mpt;
	}

	public void setMpt(MobileProcessor mpt) {
		this.mpt = mpt;
	}
	  
	
	public void tecnoFun()
	{
		System.out.println("2GB RAM,Dual Camera");
		mpt.Processor();
	}
	
	

}
