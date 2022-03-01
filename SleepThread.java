package edubridgejavaprgms1;
class Sleep extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Inside run method "+Thread.currentThread());
		    try
	    	{
			  Thread.sleep(10000);
		    }
		    catch(InterruptedException e)
		    {
			  e.printStackTrace();
		    }
	   }
   }
}

public class SleepThread {

	public static void main(String[] args) {
		Sleep ob=new Sleep();
		  Sleep ob1=new Sleep();
		  System.out.println("Main JVM Thread "+Thread.currentThread());
		  System.out.println("Thread-0 "+ob.isAlive());
		  System.out.println("Thread-1  "+ob1.isAlive());
		  ob.setName("first");
		  ob1.setName("second");
		  ob.start();
		  ob1.start();
		  

	}

}
