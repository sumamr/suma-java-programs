package AllForloopProblems;

import java.util.Scanner;
//checking a prime number and generating prime number
public class Findingprimenum {
   
	
	
	


	public static void main(String[] args) {
		int i;
		int c=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it is Prime or Not");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println(num+" is  a Prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}

	}
	

}
