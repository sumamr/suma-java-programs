package zayba.com;

public class Manytrywithmanycatch {

	public static void main(String[] args) {
		int x=12,y=0,z=10;
		int w[]=new int[5];
		System.out.println("Before Exception");
		try
		{
			System.out.println("Inside try block");
			z=x/y;//ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception will occurs");
			e.printStackTrace();
		}
		try
		{
			System.out.println("Inside another try block");
			w[10]=40;
			
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException will occurs");
			e1.printStackTrace();
		}
		finally
		{
			System.out.println("Final block is optional and executed always");
		}
		

	}

}
