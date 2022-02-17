package edubridgesuma;

import java.util.Scanner;

class Employee
{
	String ename;
	float esalary;
	String edept;
	int eid;
	
	void inputEmployeeDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name");
		ename=sc.nextLine();
		System.out.println("Enter Employee salary");
		esalary=sc.nextFloat();
		System.out.println("Enter Employee department");
		sc.nextLine();
		edept=sc.nextLine();
		System.out.println("Enter Employee id");
		eid=sc.nextInt();
	}
	void displayEmployeeDetails()
	{
		System.out.println("Employee name ="+ename);
		System.out.println("Employee salary ="+esalary);
		System.out.println("Employee Department ="+edept);
		System.out.println("Employee id ="+eid);
		
		
	}
}

public class Employeemain {

	public static void main(String[] args) {
		Employee e[]=new Employee[5];
		for(int i=0;i<e.length;i++)
		{    
			e[i]=new Employee();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].inputEmployeeDetails();
		}
		System.out.println("Employee Details");
		for(int i=0;i<e.length;i++)
		{
			e[i].displayEmployeeDetails();	
		}
		
		
		
	

	}

}
