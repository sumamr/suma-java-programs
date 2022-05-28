//find the sum of series
//(a) S=a-a2+a3-a4........+an

package com.edu;

import java.util.Scanner;

public class DoselectDemo3 {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		double n;
		double sum=0;
		System.out.println("Enter the number");
		n=sc.nextDouble();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				sum=sum+Math.pow(n, i);
				else
				{
					sum=sum-Math.pow(n, i);
				}
			
		}
		System.out.println("sum:"+sum);
		
	}

}
