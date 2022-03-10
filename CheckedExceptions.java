package zayba.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptions {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader is=new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter your Name");
		String n=null;
		try
		{
			n=br.readLine();
		}
		catch(IOException e3)
		{
		   e3.printStackTrace();	
		}
		System.out.println("Your Name is "+n);
	}

}
