package zayba.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionsdemo {

	public static void main(String[] args) throws IOException {
		String name="";
        int age=0;
        float sal=0.0f;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name");
        name=br.readLine();
        System.out.println("Enter your Age");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter Salary");
        sal=Float.parseFloat(br.readLine());
        
        System.out.println("Details of Employee");
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Salary = "+sal);
        
	}

}
