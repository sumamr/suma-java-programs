package edubridgesuma;
class Overloading
{
	void display()
	{
		System.out.println("Zero Argument");
	}
	void display(int i)
	{
		System.out.println("One argument of type Integer");
	}
	void display(float i)
	{
		System.out.println("One argument of type float");
	}
	void display(double i)
	{
		System.out.println("One argument of type double");
	}
	void display(int i,float j)
	{
		System.out.println("Two argument of type integer and float");
	}
	void display(float i,int j)
	{
		System.out.println("Two argument of type float and integer");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.display();
		o.display(23);
		o.display(23.12f);
		o.display(1325.6578);
		o.display(12,56.7f);
		o.display(123f,67);

	}

}
