package suma;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements "+a.length);
		for(i=0;i<a.length;i++)
			{
			  a[i]=sc.nextInt();
			}
		System.out.println("Array elements are");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
