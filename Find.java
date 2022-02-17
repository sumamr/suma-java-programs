package suma;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		String s;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
	     s=sc.nextLine();
	     String ch[]=s.split("");
	     System.out.println("Enter a word to search");
	     String w=sc.next();
	     for(int i=0;i<ch.length;i++)
	     {
	    	 if(ch[i].equals(w))
	    	 {
	    		 c++;
	         }
	     }
	     System.out.println("Ocurrence of word "+c);
	     String s1="hai";
	     System.out.println(s1.replaceAll("hai", "hello"));
	
		
		

	}

}
