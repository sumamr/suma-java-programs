package edubridgesuma;


class Addandsub
{
	
	void add(int i,int j)
	{
		int s=i+j;
		System.out.println("Integer sum is "+s);
	}
	void add(float i,float j)
	{
		 float s=i+j;
		System.out.println("Float sum is "+s);
	}
	void add(double i,double j)
	{
		double s=i+j;
		System.out.println("double sum is "+s);
	}
}
	

public class FunctionOverloading {

	public static void main(String[] args) {
		Addandsub ad=new Addandsub();
		ad.add(12,34);
		ad.add(23.4f,67.4f);
		ad.add(23.56,56.78);
		

	}

}
