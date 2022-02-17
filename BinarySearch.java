package suma;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]=new int[5];
		int s,low=0,mid=0,high=4;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to be Searched");
		s=sc.nextInt();
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==s)
			{
				System.out.println("Element is found at position "+(mid+1));
				break;
			}
			else if(a[mid]>s)
			{
				high=mid-1;
			}
			else if(a[mid]<s)
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("Element is not found in Array");
		}

	}

}
