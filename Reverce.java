package suma;

import java.util.Scanner;

public class Reverce {
	public static void main(String[] args) {
		String s=" ",rev=" ";
		int c=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		s=sc.nextLine();
		for(i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println("Reversed string is "+rev);
	}

}
