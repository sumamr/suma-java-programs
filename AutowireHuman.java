package com.edu;

public class AutowireHuman {
	private AutowireHeart heartobj;//Autowire byName heart and id in xml file must be same
//id and instance variable in human class should be same
	public AutowireHeart getHeartobj() {
		return heartobj;
	}

	public void setHeartobj(AutowireHeart heartobj) {
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
