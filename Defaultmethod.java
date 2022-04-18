//java 8 feature dafault and static method in interface
package lambda.com;
interface calculations
{
	void add(int a,int b);
	default void mult(int a,int b)
	{
		int m=a*b;
		System.out.println("mult product ="+m);
	}
	static void sub(int a,int b)
	{
		int ans=a-b;
		System.out.println("Difference ="+ans);
	}
}
interface MyupdateCalculations
{
	
	default void mult(int a,int b)
	{
		int m=a*b;
		System.out.println("MyupdateCalculations product ="+m);
	}
	void myfunct();
}

public class Defaultmethod  implements calculations,MyupdateCalculations{
	@Override
	public void add(int a,int b)
	{
		int s=a+b;
		System.out.println("sum="+s);
	}
	
	@Override
	public void myfunct()
	{
		
	}
		@Override
		public void mult(int a,int b)
		{
			calculations.super.mult(a, b);
			MyupdateCalculations.super.mult(7, 9);
		}
		public static void main(String[] args) {
	
		Defaultmethod ob=new Defaultmethod();
		ob.add(4, 6);
		ob.mult(8, 6);
		calculations.sub(8, 2);
	}

}
