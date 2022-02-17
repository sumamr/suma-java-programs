package suma;

import java.util.Scanner;

public class Neonnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0,digit,squarenum;
		 
		System.out.println("enter a number");
		num=sc.nextInt();
		squarenum=num*num;
		while(squarenum!=0)
		{
		  digit=squarenum%10;
		  sum=sum+digit;
		  squarenum=squarenum/10;
		}
		if(sum==num)
		{
			System.out.println("It is a Neon Number");
		}
		else
		{
			System.out.println("It is not a Neon Number");
		}
	}

}
