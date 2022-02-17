package edubridgesuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Showroom
{
	String cname;
	long mobnum;
	double cost;
	double dis;
	double amount;
	void input() throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter name of the customer");
		cname=br.readLine();
		System.out.println("Enter mobile number");
		mobnum=Long.parseLong(br.readLine());
		System.out.println("Enter cost of the item purched");
		cost=Double.parseDouble(br.readLine());
		
	}
	Showroom()
	{
		cname=null;
		mobnum=0;
		cost=0.0;
		dis=0.0;
		amount=0.0;
	}
	void calculate()
	{
		if(cost<=10000)
		{
			dis=(cost*5)/100;
		}
		else if(cost>10000 && cost<=20000)
		{
			dis=(cost*10)/100;
		}
		else if(cost>20000 && cost <=35000)
		{
			dis=(cost*15)/100;
		}
		else
		{
			dis=(cost*20)/100;
		}
		amount=cost-dis;
	}
	void display() throws IOException
	{
		System.out.println("Customer name is "+cname);
		System.out.println("Mobile number is "+mobnum);
		System.out.println("Cost is "+cost);
		System.out.println("Discount is "+dis);
		System.out.println("Amount after reducing discount is "+amount);
	}
}

public class Discount {

	public static void main(String[] args) throws IOException{
		Showroom sh=new Showroom();
		sh.input();
		sh.calculate();
		sh.display();


	}

}
