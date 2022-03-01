package edubridgejavaprgms1;
abstract class Size
{
	abstract void area();
	void display()
	{
		System.out.println("Display inside Abstract class");
	}
}
class Figure extends Size
{
	@Override
	void area()
	{
		System.out.println("Area of square");
	}
	void display()
	{
		System.out.println("Display inside Square class");
		super.display();
	}
	
}

public class AbstractMain {

	public static void main(String[] args) {
		Figure s=new Figure();
		s.area();
		s.display();
		

	}

}
