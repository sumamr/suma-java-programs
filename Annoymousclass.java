package Threadingprograms;

public class Annoymousclass {

	public static void main(String[] args) {
	Thread tob=new Thread()
				{
			     public void run()
			   {
			     	System.out.println("Run method");
		        	}
			};
			tob.start();

	}

		
		
}
