package edu.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<>();
		int e;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Elements");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Elements");
			e=sc.nextInt();
			lst.add(e);
		}
		System.out.println("Array List Elements ="+lst);
		
		System.out.println("Enter Element to search");
		int s=sc.nextInt();
		if(lst.contains(s))
		{
			System.out.println(s+" present in list");
		}
		else
		{
			System.out.println(s+" is not present in list");
		}
		ArrayList<Integer> cl=(ArrayList<Integer>) lst.clone();
		System.out.println(cl);
		
		System.out.println(lst.subList(2, 4));

	}

}
