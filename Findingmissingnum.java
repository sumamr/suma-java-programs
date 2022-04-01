package uday.com;

public class Findingmissingnum {

	public static void main(String[] args) {
		int a[]= {1,3,4,5};
		//find sum of n natural numbers
		int n=5,s,arraysum=0;
		s=n*(n+1)/2;// sum of n natural numbers
		//s=1+2+3+4+5=15
		
		//sum of all array elements
		for(int i=0;i<a.length;i++)
		{
			arraysum= arraysum + a[i];
		}
		int missingnum =s-arraysum;
		System.out.println("Missing number is "+missingnum);

	}

}
