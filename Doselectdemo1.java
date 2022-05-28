package com.edu;

import java.util.Scanner;

public class Doselectdemo1 {

	public static void main(String[] args) {
		int n1,n2,n3,lar;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number");
		n1=sc.nextInt();
		System.out.println("Enter a second number");
		n2=sc.nextInt();
		System.out.println("Enter a Third number");
		n3=sc.nextInt();
		lar=(n1>n2&&n1>n3)?n1:(n2>n1&&n2>n3)?n2:n3;
		System.out.println("The largest of  "+n1+"  ,"+n2+" and  "+n3+" is "+lar);
		
		if(n1>0 && n2>0 && n3>0) {
			System.out.println("Entered number is positive");
		}
		  else if(n1<0 &&  n2<0 && n3<0)
		  {
			System.out.println("Entered number is negative");
		}
		  else
		  {
			  System.out.println("Mixed numbers");
		  }
			
		}
		
	}
	
			
			
	
		


