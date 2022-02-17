package suma;

import java.util.Scanner;

public class MENU {

	public static void main(String[] args) {
		int ch=0;
		float side,base,height,radius,width,length,area,pi;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the value of side");
		side=sc.nextFloat();
		System.out.println("Enter the value of base");
		base=sc.nextFloat();
		System.out.println("Enter the value of height");
		height=sc.nextFloat();
		System.out.println("Enter the value of radius");
		radius=sc.nextFloat();
		System.out.println("Enter the value of width");
		width=sc.nextFloat();
		System.out.println("Enter the value of length");
		length=sc.nextFloat();
		System.out.println("enter the value of pi");
		pi=sc.nextFloat();
		
		System.out.println("@@@@@@  MENU   @@@@@@@@@");
		System.out.println("1.CIRCLE");
		System.out.println("2.TRIANGLE");
		System.out.println("3.SQUARE");
		System.out.println("4.RECTANGLE");
		System.out.println("Please enter your choice");
		ch=sc.nextInt();
		System.out.println("^^^^^^^^^^^^^^^");
		switch(ch)
		{
		case 1: area=(pi*radius*radius);
		         System.out.println("the area of circle is "+area);
		         break;
		case 2: area=(base*height)/2;
		        System.out.println("The area of Triangle is  "+area);
		        break;
		case 3: area=(side*side);
		        System.out.println("The area of Square is" +area);
		        break;
		case 4: area=width*length;
		        System.out.println(" The area of Rectangle  "+area);
		        break;
		default: System.out.println(" Invalid choice");
		          break;
		}
		
		
		
		

	}

}
