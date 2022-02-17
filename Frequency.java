package suma;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		int a[]=new int[5],count=0,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		s=sc.nextInt();
		
			for(int i=0;i<a.length;i++)
			{
			   if(s==a[i])
			    {
				   count++;
			    }
			}
			   if(count==0)
			   {
				   System.out.println("NOT FOUND");
			   }
			   else 
			   {
				 System.out.println("Element found at the position "+count);
		}
		

	}

}
