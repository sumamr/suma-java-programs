package edubridgesuma;

import java.util.Scanner;

class Student
{
	String name;
	int age;
	long pnum;
	String add;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Student name");
		name=sc.nextLine();
		System.out.println("Enter a Student age");
		age=sc.nextInt();
		System.out.println("Enter a Student contact number");
		pnum=sc.nextLong();
		
		System.out.println("Enter a Student Address");
		sc.nextLine();
		add=sc.nextLine();
	}
	void display()
	{
		 System.out.println("Name = "+name);
		 System.out.println("Age  = "+age);
		 System.out.println("Contact number  = "+pnum);
		 System.out.println("Address ="+add);
		 
	}
}

public class OopsDemo {

	public static void main(String[] args) {
	  Student s=new Student();
	  Student s1=new Student();
	  s.input();
	  s.display();
	  s1.input();
	  s1.display();

	}

}
