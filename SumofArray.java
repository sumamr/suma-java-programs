package suma;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		int a[]=new int[5],sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+a.length+" Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enterd Array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Sum of all Array elements");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum ="+sum);
		
		avg=(float)sum/a.length;
		System.out.println("Average of Array elements are "+avg);
		
		

	}

}
