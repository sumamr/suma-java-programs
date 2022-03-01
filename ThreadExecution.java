package edubridgejavaprgms1;
class Myclass1 extends Thread
{
	public void run()
	{
		System.out.println("Inside run method "+Thread.currentThread());
	}
}

public class ThreadExecution {

	public static void main(String[] args) {
	  Myclass1 ob=new Myclass1();
	  Myclass1 ob1=new Myclass1();
	  System.out.println("Main JVM Thread "+Thread.currentThread());
	  System.out.println("Thread-0 "+ob.isAlive());
	  System.out.println("Thread-1  "+ob1.isAlive());
	  ob.setName("first");
	  ob1.setName("second");
	  ob.start();
	  ob1.start();
	  System.out.println("Thread-0  "+ob.isAlive());
	  System.out.println("Thread-1 "+ob1.isAlive());

	}

}
