package Threadingprograms;

class suma extends Thread
{
	public void run()
	{
		System.out.println("Inside run method "+Thread.currentThread());
	}
}
public class Threaddemo {

	public static void main(String[] args) {
		System.out.println("Main JVM Thread" +Thread.currentThread());
		suma au=new suma();
		au.setName("First");
		suma au1=new suma();
		au1.setName("Second");
		au.setPriority(5);
		au.start();
		au1.start();// if we start more than once ,it throws IllegalThreadStateException
		au1.getName();
		au.start();

	}

}
