package edu.com;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CheckingVowelsConst {

	public static void main(String[] args) {
		int v=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		TreeSet<Character> s1=new TreeSet<>();
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			s1.add(c1);
		}
		System.out.println(s1);
		
		Iterator<Character> it=s1.iterator();
		while(it.hasNext())
		{
			char ch=it.next();
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='0'||ch=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Number of unique vowels "+v);
		System.out.println("Number of unique consonents "+c);
		

	}

}
