package Threadingprograms;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" "+Thread.currentThread());
		}
		
	}
}

public class Lifecycleofthread {

	public static void main(String[] args) {
	A ob1=new A();//born state
	A ob2=new A();
	System.out.println("State of thread ob1 "+ob1.isAlive());
	System.out.println("State of thread ob2 "+ob2.isAlive());
	ob1.start();//run 
    System.out.println("State of thread  ob1 "+ob1.isAlive());
  
    System.out.println("State of thread ob1 "+ob1.isAlive());
    ob1.start();
    System.out.println("State of thread ob2 "+ob2.isAlive());
    ob2.start();
    

	}

}
