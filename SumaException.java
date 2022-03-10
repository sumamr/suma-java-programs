package zayba.com;

import java.util.Scanner;

public class SumaException {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter Second number");
		b=sc.nextInt();
		System.out.println("Before Division");
		try
		{
			c=a/b;
		}
		catch(ArithmeticException i)
		{
		    System.out.println("catch will executes when the error will occur");
		    i.printStackTrace();
		}
		finally
		{
			System.out.println("finally block will always executes");
		}
		System.out.println("after division");
		System.out.println("Program other statements");
	}

}
