package suma;

import java.util.Scanner;

public class BufferDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		StringBuffer a=new StringBuffer(s);
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|ch=='u')
			{
				a.deleteCharAt(i);
			}
		}
		System.out.println("After Removing vowels "+a);
		

	}

}
