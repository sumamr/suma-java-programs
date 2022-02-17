package suma;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]=new int[5],pos=0;
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Enter the element to be searched");
		s=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				pos=i+1;
				break;
				
			}
		}
		if(pos>0)
		{
			System.out.println("Sucessful search");
			System.out.println("the element "+s+" found at position "+pos);
		}
		else
		{
			System.out.println("unsucessful search");
		}

	}

}
