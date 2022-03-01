package edubridgejavaprgms1;
class MyFirstClass
{
	private int pri;
	public int pubj;
	protected int protk;
	int dfm;
	 
	void myFirstClassDisplay()
	{
		System.out.println("private can be accessed "+pri);
		System.out.println("Public can be accessed "+pubj);
		System.out.println("protected can be accessed "+protk);
		System.out.println("default can accessed "+dfm);
	}
}
class IndependenceClass
{
	void display()
	{
		MyFirstClass mob=new MyFirstClass();
		System.out.println("Public can accessed "+mob.pubj);
		System.out.println("protected can accessed "+mob.protk);
		System.out.println("default can accessed "+mob.dfm);
		
	}
}
class MyExtendedClass extends MyFirstClass
{
	void extendedDusplay()
	{
		MyExtendedClass mob1=new MyExtendedClass();
	System.out.println("Public can accessed "+mob1.pubj);
	System.out.println("protected can accessed "+mob1.protk);
	System.out.println("default can accessed "+mob1.dfm);
	}
}


public class Hdemo {

	public static void main(String[] args) {
		IndependenceClass ob=new IndependenceClass();
		ob.display();

	}

}
