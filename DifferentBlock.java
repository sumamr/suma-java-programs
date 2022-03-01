package edubridgejavaprgms1;



public class DifferentBlock {
	static
	{
		System.out.println("Static will execute before main");
	}
	{
		System.out.println("Normal block before constructor on object creation");
	}
	DifferentBlock()
	{
		System.out.println("On Object creation constructor will executes");
	}
	void display()
	{
		System.out.println("Display method");
	}

	public static void main(String[] args) {
		DifferentBlock ob=new DifferentBlock();
		ob.display();

	}

}
