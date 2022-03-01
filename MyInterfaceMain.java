package edubridgejavaprgms1;
interface MyInterface1
{
	int k=10;
	void display();
	void add();
}
abstract class Irf1 implements MyInterface1
{
	@Override
	public void display()
	{
	 System.out.println("Display method");	
	}
}
class SecondClass1 extends Irf1
{
	@Override
	public void add()
	{
		System.out.println("Add method");
	}
	
	
	
}
public class MyInterfaceMain{

	public static void main(String[] args) {
	SecondClass1 s=new SecondClass1();
	s.add();
    s.display();

	}

}
