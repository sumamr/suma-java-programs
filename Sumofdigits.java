package AllForloopProblems;

import java.util.Scanner;

public class Sumofdigits {
	static void sumdigit()
	{
		int digit;
		int n;
		int sum=0;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		n=sc.nextInt();
		while(n!=0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
			c++;
		}
		System.out.println("The sum of digits is ; "+sum);
		System.out.println("The number of digits you entered is : "+c);
	}

	public static void main(String[] args) {
		Sumofdigits.sumdigit();

	}

}
