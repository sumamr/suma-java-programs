package AllForloopProblems;
//find the sum of 1+2-3+4-5+6-7+8-9+10

public class Sumofseriesusingforloop {

	public static void main(String[] args) {
		int n=10;
		int sum=0;
		int i,j;
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum-i;
			}
			else
			{
				sum=sum+i;
			}
			
		}
		System.out.println("The sum of given series is : "+sum);

	}

}
