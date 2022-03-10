package zayba.com;

import java.util.Scanner;

public class Arrayoutofbound {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<a.length+1;i++)
		{
			try
			{
				System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException o) {
				o.printStackTrace();
			}
		}
		System.out.println("Statements After for loop");

	}

}
