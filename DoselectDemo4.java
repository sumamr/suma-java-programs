//find the sum of 1!+2!+3!+.............

package com.edu;

public class DoselectDemo4 {

	public static void main(String[] args) {
		int i,j;
		int sum=0;
		int n;
		for(i=1;i<=3;i++)
		{
			n=1;
			for(j=1;j<=i;j++)
			{
				n=n*j;
			}
			sum=sum+n;
		}
		System.out.println("Sum of series is : "+sum);

	}

}



