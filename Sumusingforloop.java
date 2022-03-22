package AllForloopProblems;
//find the sum of 1+2+3+4+5+6+7+8+9+10

public class Sumusingforloop {

	public static void main(String[] args) {
		int i,n=10;
		int sum=0;
		for(i=0;i<=n;++i)
		{
			sum=sum+i;
		}
		System.out.println("The sum of given series is : "+sum);

	}

}
