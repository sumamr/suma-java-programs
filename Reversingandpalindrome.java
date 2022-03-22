package AllForloopProblems;

import java.util.Scanner;

public class Reversingandpalindrome {

	public static void main(String[] args) {
		int digit;
		int rev=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		num=sc.nextInt();
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("The reversed number is : "+rev);
		int n1=num;
		if(n1==rev)
		{
			System.out.println("Given number is palindrome");
			
		}
		else {
			System.out.println("It is not a palindrome");
		}

	}

}
