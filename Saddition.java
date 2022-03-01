package edubridgejavaprgms1;
class Addition
{
	static int i;
	static int k;
	static int s;
	int m,n,s1;
	Addition(int p,int q)
	{
		m=p;n=q;
	}
	static 
	{
		i=8;
		k=9;
	}
	static void add()
	{
		s=i+k;
		System.out.println("sum="+s);
	}
	void nonstaticAddition()
	{
		s1=m+n;
		System.out.println("Addition of Non Static variable is: "+s1);
	}
}

public class Saddition {

	public static void main(String[] args) {
		Addition.add();
		Addition ob=new Addition(6,7);
		Addition ob1=new Addition(89,76);
		ob.nonstaticAddition();
		ob1.nonstaticAddition();

	}

}
