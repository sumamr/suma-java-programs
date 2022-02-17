package suma;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Array is "+min);
		max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum array is "+max);

	}

}
