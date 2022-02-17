package suma;

import java.util.Scanner;

public class Division {
	public static void main(String[]  args) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num1=sc.nextInt();
		if(num1%5==0&&num1%3==0)
		{
			System.out.println("the number is divisible by 5 and 3");
		}
		else
		{
			System.out.println("Not divisible by both");
		}
        if(num1%3==0)
		{
			System.out.println(num1+" is divisible only by 3");
		}
		else 
	    if(num1%5==0)
		{
			System.out.println(num1+" is divisible only by 5");
		}
		else
		{
			System.out.println("not divisible by both");
		}
	}

}
