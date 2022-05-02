package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    MobileProcessor mp;

	public MobileProcessor getMp() {
		return mp;
	}

	public void setMp(MobileProcessor mp) {
		this.mp = mp;
	}
    
    void phConfig()
    {
    	System.out.println("128 mp camera,64 mb Ram,Dual core");
    	mp.processor();
    }
    
}
