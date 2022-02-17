package suma;
import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {
		int i,num,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		for(i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of given number is "+num+" is "+fact);
	}

}
