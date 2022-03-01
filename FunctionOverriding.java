package edubridgejavaprgms1;
class Shape
{
	void area()
	{
		System.out.println("Area of shape class");
	}
}
class Square extends Shape
{
	void area()
	{
		System.out.println("Area of square class");
	}
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Area of Rectangle class");
	}
}

public class FunctionOverriding {

	public static void main(String[] args) {
	   Shape sh;
	   sh=new Rectangle();
	   sh.area();
	   sh=new Square();
	   sh.area();

	}

}
