package AllForloopProblems;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		int digit;
		int sum=0;
		int sqnum=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it is neon or not");
		num=sc.nextInt();
		sqnum=num*num;
	    
		while(num!=0)
		{
			digit=num%10;
			sqnum=sqnum+digit;
			num=num/10;
		}
		if(num==sum)
		{
			System.out.println("It is a Neon number");
		}
		else
		{
			System.out.println("It is not a Neon number ");
		}
		

	}

}
