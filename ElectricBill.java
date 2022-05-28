package com.edu;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		float units;
		double amount;
		double fixedrate=350.00;
		 double surcharge=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of units");
		units=sc.nextFloat();
		if(units<0)
		{
			
			System.out.println("Program is terminated because unit is negative");
			System.exit(0);
		}
		if(units>0 && units <=100)
		{
			amount=units*2.0f;
		}
		else if(units>100 && units<=300)
		{
			amount=100*2.0f+(units-100)*3.0f;
		}
		else
		{
			amount=100*2.0f+200*3.0f+300*5.0f;
		}
		surcharge=(amount*2.5f)/100;
		System.out.println("Bill Amount is : "+amount);
		System.out.println("Surcharge is "+surcharge);
 
	}
	

}
