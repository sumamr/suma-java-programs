package edu.com;//all types of iteration in arraylist

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class IterationOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Elements you want");
		n=sc.nextInt();
		
		System.out.println("Enter "+n+" elements into arraylist");
		for(int i=1;i<=n;i++)
		{
			int e=sc.nextInt();
			li.add(e);
		}
		System.out.println("Using list "+li);
		//using normal forloop
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		//using enhanced forloop for each
		for(Integer i:li)
		{
			System.out.println(i);
		}
		//using Iterator
		System.out.println("Iterating elements using iterator interface");
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//using listiterator:for both forward and backward direction
		System.out.println("Using ListIterator");
		ListIterator lit=li.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		//printing in backward direction
		System.out.println("printing in reverce order");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}

	}

}
