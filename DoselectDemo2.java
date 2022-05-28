package com.edu;

import java.util.Scanner;

public class DoselectDemo2 {

	public static void main(String[] args) {

		int digit=0,sum=0,mul=1;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
	    int	num=sc.nextInt();
		int spnum=num;
		
		while(num!=0){
			digit=num%10;
			num=num/10;
			sum=sum+digit;
			mul=mul*digit;
		}
		total=mul+sum;
		
		if(spnum==total)
		{
			System.out.println("Special 2 digit numbers");
		}
		else
		{
			System.out.println("Not a special 2 digit numbers");
		}
			}

}
