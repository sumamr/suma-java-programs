package suma;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		float units;
		double amount;
		double fixedrate=350.00;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of units");
		units=sc.nextFloat();
		if(units<100)
		{
			amount=(units*1.50)+fixedrate;
		}
		else if(units>=101&&units<=150) {
			amount=100*1.50+(units-100)*2.50+fixedrate;
		}
		else if(units>=151&&units<=250) {
			amount=100*1.50+50*2.00+(units-150)*4.00+fixedrate;
		}
		else {
			amount=100*1.50+50*2.00+100*2.5+(units-250)*4.00+fixedrate;
		}
		System.out.println("Total bill amount is "+amount);
		

	}

}
