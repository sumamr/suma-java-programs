package suma;

import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		float f,c;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.conversion from Farenheit to celsius");
		System.out.println("2.converdion from celsius to farenheit");
		System.out.println("3.please enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter the value of temperature in farenheit");
		        f=sc.nextFloat();
	        	c= (f-32)*5/9;
		        System.out.println("the temperature in celsius is "+c);
		        break;
		case 2: System.out.println("Enter the value of temperature in celsius");
		         c=sc.nextFloat();
		         f=c*9/5+32;
		         System.out.println("The temperature in Farheit");
		         break;
		         
		  default: System.out.println("Invalid choice");
		           break;
		}

	}

}
