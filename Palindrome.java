package suma;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,digit,rev=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.println("before while num is  "+num);
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reversed number is "+rev);
		if(rev==num)
		{
			System.out.println("It is a palondrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		// TODO Auto-generated method stub

	}

}
