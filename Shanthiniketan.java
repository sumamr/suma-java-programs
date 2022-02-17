package edubridgesuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class School
{
	String sname;
	int sid;
	float fees;
	 
	void input() throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter a Student name");
		sname=br.readLine();
		System.out.println("Enter Student id");
		sid=Integer.parseInt(br.readLine());
		System.out.println("Enter Student fees");
		fees=Float.parseFloat(br.readLine());
		
	}
	void display()
	{
		System.out.println("Student name is "+sname);
		System.out.println("Student id is "+sid);
		System.out.println("Student Fees is "+fees);
	}
	
}

public class Shanthiniketan {

	public static void main(String[] args) throws IOException {
		School sc=new School();
		sc.input();
		sc.display();

	}

}
