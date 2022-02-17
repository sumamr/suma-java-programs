package suma;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if( num%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
