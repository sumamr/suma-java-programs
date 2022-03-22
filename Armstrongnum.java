package AllForloopProblems;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		int num;
		int sum=0;
		int digit;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find it is armstrong or not");
		num=sc.nextInt();
		int n1=num;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+(digit*digit*digit);//sum=sum+(int)Math.pow(digit*3);
			num=num/10;
		}
		if(n1==sum)
		{
			System.out.println("It is a Armstrong number");
		}
		else
		{
			System.out.println("It is not a Armstrong number");
		}

	}

}
