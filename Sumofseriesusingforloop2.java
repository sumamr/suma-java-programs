package AllForloopProblems;
//find the sum of 1/2+1/3+1/4+1/5+......
public class Sumofseriesusingforloop2 {

	public static void main(String[] args) {
		int n=10;
		int i;
		float s=0;
		for(i=2;i<=n;i++)
		{
		  s=s+(float)1/i;	
		}
		System.out.println("The sum of given series is : "+s);

	}

}
