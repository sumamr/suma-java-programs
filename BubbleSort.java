package suma;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int a[],i,j,temp,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Array Elements are");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements Before Sorting");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted element are");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
