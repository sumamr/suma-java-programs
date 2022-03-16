package zayba.com;
class Overload
{
	void display()
	{
		System.out.println("No argument display");
	}
	void display(int i)
	{
		System.out.println("int one argument function "+i);
	}
	void display(float i)
	{
		System.out.println("float one argument functions "+i);
	}
	void display(int i,int j)
	{
		System.out.println("two int argument functions "+i+" and "+j);
	}
	void display(int i,int j,int k)
	{
		System.out.println("Three int argument functions "+i+" and "+j+" and "+k);
	}
	void display(float i,float j)
	{
		System.out.println("Two float arguments "+i+" and "+j );
	}
	void display(float i,int j)
	{
		System.out.println("float and int two arguments "+i+" and "+j);
	}
}

public class FunctionOverloading {

	public static void main(String[] args) {
		Overload fo=new Overload();
		fo.display();
		fo.display(2.0f,7);
		fo.display(7,8);
		fo.display(1.2f,6.6f);
	}


}
