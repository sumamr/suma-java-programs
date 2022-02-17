package suma;

import java.util.Scanner;

public class UserPass {

	public static void main(String[] args) {
		String uname,upass;
		int pattempt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("You have maximum 3 attempts to login");
		System.out.println("Your account will be locked");
		System.out.println("you can try after 24 hours");
		for(pattempt=1;pattempt<=3;pattempt++)
		{
			System.out.println("Enter Your Username");
			uname=sc.next();
			System.out.println("Enter your password");
			upass=sc.next();
			if(uname.equalsIgnoreCase("suma")&&upass.equals("suma123"))
		    {
			  System.out.println("Login Sucessfull");
			  break;
		    }
		    else if(pattempt==2)
		    {
		      System.out.println("Invalid username and password");
			  System.out.println(pattempt+"  Attempts is left");
		   }
		    else if(pattempt==1)
		    {
		    	System.out.println("Invalid username and password");
				  System.out.println(pattempt+"  Attempts are left");
		    }
		}
		if(pattempt==4)
		{
		  System.out.println("sorry your account is LOCKED try after 24 hours");
		}

	}
}


