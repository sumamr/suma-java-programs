package edubridgesuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ticket
{
	String name;
	String coach;
	long mobnum;
	int amt;
	int totalamt;
	String FAc,SAc,TAc;
	int nt;
	void input() throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(is);
	    System.out.println("Enter a name of Passenger");
	    name=br.readLine();
	    System.out.println("Enter type of coach");
	    coach=br.readLine();
	    System.out.println("Enter mobile number");
	    mobnum=Long.parseLong(br.readLine());
	    System.out.println("Enter number of Tickets");
	    nt=Integer.parseInt(br.readLine());
	}
	void update()
	{
		System.out.println(coach);
		if( coach.equals("FAc"))
		{
			amt = 750;	
		   System.out.println("inside FAc "+amt);	
		}
		else if(coach.equals("SAc"))
		{
			amt = 500;
		}
		else if(coach.equals("TAc"))
		{
			amt = 250;
		}
		else
		{
			amt= 0;
		}
			
	}
	void display()
	{
		System.out.println(amt);
		System.out.println("Name "+name);
		System.out.println("Coach "+coach);
		System.out.println("Mobile Number  "+mobnum);
		System.out.println("Amount "+amt);
		System.out.println("Total amount "+(amt*nt));
	}
	
	
}

public class Railway {

	public static void main(String[] args) throws IOException {
		Ticket tc=new Ticket();
		tc.input();
		tc.update();
		tc.display();

	}

}
