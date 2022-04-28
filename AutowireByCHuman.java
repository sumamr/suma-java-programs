package com.edu;

public class AutowireByCHuman {
	private AutowireByCHeart heart;

	public AutowireByCHuman(AutowireByCHeart heart) {
		super();
		this.heart = heart;
	}
	public void humanFunction()
	{
		if(heart!=null)
		{
			heart.pump();
		}
		else
		{
			System.out.println("Not Alive");
		}
	}

}
