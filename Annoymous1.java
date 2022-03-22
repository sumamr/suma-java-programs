package Threadingprograms;

public class Annoymous1 {

	public static void main(String[] args) {
		new Thread()
		{
			public void run()
			{
				System.out.println("RUN METHOD");
			}
		}.start();

	}

}
