package edubridgesuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Transport
{
	String name;
	int w;
	int charge;
	int surcharge;
	
	void accept() throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter name of the customer");
		name=br.readLine();
		System.out.println("Enter Weight of the parcel");
		w=Integer.parseInt(br.readLine());
		
	}
	 void calculate()
	 {
		 if(w<=10)
		 {
			 charge=w*25;
		 }
		 else if(w>10 && w<=30)
		 {
			 charge=10*25+(w-10)*20;
		 }
		 else
		 {
			 charge=10*25+20*20+(w-30)*10;
		 }
		 surcharge=(charge*5)/100;
	 }
	 void print()
	 {
		 System.out.println("Name\tWeight\tCharge\tSurcharge");
		 System.out.println("________________________________");
		 System.out.print(name+"\t"+w+"\t"+charge+"\t"+surcharge);
		 
		 }
}

public class Anshul {

	public static void main(String[] args) throws IOException {
	 Transport tr=new Transport();
	 tr.accept();
	 tr.calculate();
	 tr.print();

	}

}
