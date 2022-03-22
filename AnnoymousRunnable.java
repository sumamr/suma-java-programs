package Threadingprograms;

public class AnnoymousRunnable {

	public static void main(String[] args) {
		Runnable rob=new Runnable()
				{
			       public void run()
			       {
			       	System.out.println("Runnable Run Method");
			       }
				};
				Thread tob1=new Thread(rob);
				tob1.start();

	}

}
