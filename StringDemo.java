package suma;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String s;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		s=sc.nextLine();
	    String s1 = s.toLowerCase();
	    System.out.println("Number of chracters ="+s.length());
	    for(int i=0;i<s1.length();i++) {
	    	char ch=s1.charAt(i);
	    	if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' ||ch=='u')
	        {
	    	  c=c+1;	
	    	}
	    }
	    System.out.println("Number of vowels ="+c);
	    
		

	}

}
