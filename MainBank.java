package edubridgejavaprgms1;

import java.util.Scanner;

class CheckBankBalance extends Exception
{
	CheckBankBalance(String s)
	{
		super(s);
	}
}
class HDFC
{
	int balance=10000;
	void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("Balance is "+balance);
	}
	void withdraw(int amount)
	{
		try
		{
			if(amount>balance)
			{
				throw new CheckBankBalance("Amount exceeds balance");
			}
			else
			{
				balance=balance-amount;
				System.out.println("total balance is "+balance);
			}
			
		}
		catch(CheckBankBalance c)
		{
			c.printStackTrace();
		}
		
	}
}

public class MainBank {

	public static void main(String[] args) {
		HDFC ob=new HDFC();
		ob.deposit(120);
		ob.withdraw(70000);
		

	}

}
