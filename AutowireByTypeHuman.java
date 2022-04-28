package com.edu;

public class AutowireByTypeHuman {
	private AutowireByTypeHeart heartobj;

	public AutowireByTypeHeart getHeartobj() {
		return heartobj;
	}

	public void setHeartobj(AutowireByTypeHeart heartobj) {
		this.heartobj = heartobj;
	}
	
public void humanFunction()
{
	if(heartobj!=null)
	{
		heartobj.pump();
	}
	else
	{
		System.out.println("Not Alive");
	}
}
}
