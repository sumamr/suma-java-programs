package suma;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,digit,sum=0;
		
		System.out.println("Enter a number");
		num=sc.nextInt();
		int num1=num;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println("it is a Armstrong number");
		}
		else
		{
			System.out.println("It is not a Armstrong number");
		}
		
		
		// TODO Auto-generated method stub

	}

}
