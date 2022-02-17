package suma;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num1=sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("the numberis odd");
		}
		

	}

}
