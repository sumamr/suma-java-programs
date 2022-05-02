package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TecnoSpark5 {
	
	@Autowired
	MobileProcessor mp;

	public MobileProcessor getMp() {
		return mp;
	}

	public void setMp(MobileProcessor mp) {
		this.mp = mp;
	}
	public void MobileFun()
	{
		System.out.println("2GB RAM,dual sim,14 px Camera");
		mp.Processor();
	}

}
