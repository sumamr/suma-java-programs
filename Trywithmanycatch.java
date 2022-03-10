package zayba.com;

public class Trywithmanycatch {

	public static void main(String[] args) {
		int a=10,b=0,c=30;
		int s[]=new int[3];
		System.out.println("Before Exception");
		try
		{
			System.out.println("Inside try");
			c=a/b;
			s[4]=40;
		}
		catch(ArithmeticException z)
		{
			System.out.println("Arithmetic Exception will occur");
			z.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException q)
		{
			System.out.println("ArrayIndexOutOfBoundsException will occur");
			q.printStackTrace();
		}
		finally
		{
			System.out.println("final block is optional and Executed always");
		}

	}

}
