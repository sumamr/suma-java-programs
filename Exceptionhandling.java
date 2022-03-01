package edubridgejavaprgms1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Exceptionhandling1 extends Exception{
	void chkExcept()
	{
		int a=10,b=2,c=0;
		int ar[]=new int[3];
		System.out.println("Before division");
		try
		{
			c=a/b;
			System.out.println("After a/b "+c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Inside catch");
			ex.printStackTrace();
			System.out.println("ex.getMessage()");
		}
		finally
		{
			System.out.println("finally will executes always");
		}
		System.out.println("finally block is used to close resources data base,network");
	}
}
	//System.out.println("After catch");
	public class Exceptionhandling{

	public static void main(String[] args) throws  IOException {
		Exceptionhandling1 ob=new Exceptionhandling1();
		ob.chkExcept();
		int a=10;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name=br.readLine();
		System.out.println(name);

	}

}
