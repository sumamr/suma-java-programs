package edubridgejavaprgms1;
interface MYInterface
{
 int i=10;
 void add();
}
class MyClass implements MYInterface
{
	public void add()
	{
		System.out.println("Interface method addition implementation "+i);
	}
}

public class IntefaceModifier {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
				ob.add();

	}

}
