package zayba.com;
class Oadd
{
	void add(int i,int j)
	{
		int s=i+j;
		System.out.println("Addition of "+i+" and "+j+" integer values are "+s);
	}
	void add(float i,float j)
	{
		float s=i+j;
		System.out.println("Addition of "+i+" and "+j+" float values are "+s);
		
	}
	void add(double i,double  j)
	{
		double s=i+j;
		System.out.println("Addition of "+i+" and "+j+" double values are "+s);
		
	}
}

public class AddOverloading {

	public static void main(String[] args) {
		Oadd o=new Oadd();
		o.add(2, 5);
		o.add(23.9f,78.09f);
		o.add(23.0,67.9);

	}

}
