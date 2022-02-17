package suma;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		float sal;
		char gen;
		System.out.println("Enter Employee name");
		name=sc.nextLine();
		System.out.println("Enter Employee age");
		age=sc.nextInt();
		System.out.println("Enter employee salary");
		sal=sc.nextFloat();
		System.out.println("Enter employee gender");
		gen=sc.next().charAt(0);
		 
		System.out.println("EMPLOYRR DETAILS");
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+sal);
		System.out.println("Gender = "+gen);

	}

}
