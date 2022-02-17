package suma;

import java.util.Scanner;

public class Simplecalculator {
	public static void main(String[] args) {
	int fnum,secnum,ans,choice=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	fnum=sc.nextInt();
	System.out.println("Enter second number");
	secnum=sc.nextInt();
	System.out.println("####### MENU ######");
	
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("3.Division");
	System.out.println("4.Modulation");
	System.out.println("please enter your choice");
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 1: ans=fnum+secnum;
		    System.out.println("Addition of "+fnum+" and "+secnum+" is "+ans);
		    break;
	case 2: ans=fnum-secnum;
	        System.out.println("Difference of "+fnum+" and "+secnum+" is "+ans);
	        break;
	case 3: ans=fnum*secnum;
	        System.out.println("Multiplication of "+fnum+" and "+secnum+" is "+ans);
	        break;
	case 4: ans=fnum/secnum;
	        System.out.println("Division of "+fnum+" and "+secnum+" is "+ans);
	        break;
	case 5: ans=fnum%secnum;
	        System.out.println("Modular of "+fnum+" and "+secnum+" is "+ans);
	        break;
	 default : System.out.println("Invalid input");
	            break;
	}
	   
			
	}
	
	

}
