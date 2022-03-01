package edubridgejavaprgms1;

import java.util.Scanner;

class Employee
{
	int eid;
	String name;
	static String cname="Capgemini";
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		name=sc.next();
		System.out.println("Enter Employee id");
		eid=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("ID ="+eid);
		System.out.println("Company name ="+cname);
	}
	

}

public class StaticDemo {

	public static void main(String[] args) {
		Employee e[];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of Employees");
		int n=input.nextInt();
		e=new Employee[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].accept();
		}
		System.out.println("Employee Details");
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		
		

	}

}
