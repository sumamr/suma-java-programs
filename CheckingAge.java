package edubridgejavaprgms1;

import java.util.Scanner;
class CheckAgeVoting extends Exception
{
	CheckAgeVoting(String s)
	{
		super(s);
	}
}

public class CheckingAge {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new CheckAgeVoting("not eligible for voting");
			}
		}
		catch(CheckAgeVoting e)
		{
			e.printStackTrace();
		}

	}

}
