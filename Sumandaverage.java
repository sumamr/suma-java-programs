package arraylist.com;

import java.util.Scanner;

public class Sumandaverage {

	public static void main(String[] args) {
	 int ar[]=new int[5];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter array Elements " +ar.length);
	 for(int i=0;i<ar.length;i++)
	 {
		 ar[i]=sc.nextInt();
	 }
	 System.out.println("Array Elements are : ");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.println(ar[i]);
	 }
	 System.out.println("Sum of array Elements are");
	 int s=0;
	 for(int i=0;i<ar.length;i++)
	 {
		 s=s+ar[i];
	 }
	 System.out.println("Sum = "+s);
	 System.out.println("Average = "+(float)s/ar.length );
	 
	 
	 
	 //finding maximum number
	 int max=ar[0];
	 for(int i=1;i<ar.length;i++)
	 {
		 if(ar[i]>max)
		 {
			 max=ar[i];
		 }
	 }
	 System.out.println("Maximum of array element is "+max);
	 
	 
	 //finding minimum number
	 int min=ar[0];
	 for(int i=1;i<ar.length;i++)
	 {
		 if(ar[i]<min)
		 {
			 min=ar[i];
		 }
	 }
	 System.out.println("Minimum of array element is "+min);

	}

}
