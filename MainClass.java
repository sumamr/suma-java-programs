package P2;

import java.util.Scanner;

import P1.Employee;

class Contractor extends Employee
{
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		name=sc.next();
		System.out.println("Enter a age");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
	}
}


class MainClass {

	public static void main(String[] args) {
	Contractor c=new Contractor();
	c.input();
	c.display();
	

	}

}
