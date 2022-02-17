package suma;

import java.util.Scanner;

public class StringOccurrence {

	public static void main(String[] args) {
		String s;
		char ch;
		int i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.nextLine().toLowerCase();
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		for(i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				c++;
			}
		}
		System.out.println(ch+" character is present "+c+" times");

	}

}
