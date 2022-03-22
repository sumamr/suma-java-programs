package Threadingprograms;
class Myclass extends Thread
{
	int total;
	public void run()
	{
		System.out.println("Inside run");
		synchronized (this)
		{
			for(int i=1;i<=10;i++)
			{
				total=total+i;
			}
			notify();
				
		}
	}
}
public class Threadcommunication {

	public static void main(String[] args) throws InterruptedException {
        Myclass ob=new Myclass();
        ob.start();
        synchronized(ob)
        {
        try
        {
        	System.out.println("Before wait");
        	ob.wait();
        	System.out.println("After wait");
        	System.out.println("Total="+ob.total);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        }

	}

}
