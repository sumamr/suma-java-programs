package edubridgesuma;
class Addition
{
	int i,j,s;
	Addition()
	{
    	System.out.println("Constructor calls when object is created");
	    System.out.println("Constructor name is same as class name");
	    System.out.println("There is no return type");
	    i=2;
	    j=7;
	}
	Addition(int k,int l)
	{
		i=k;
		j=l;
	}
	void add()
	{
		s=i+j;
	}
	void display()
	{
		System.out.println("@@@@@@@@@@@");
		System.out.println("The sum of "+i+" amd "+j+" is "+s);
	}
}

public class Constructor {

	public static void main(String[] args) {
		//non parameterized constructor
		Addition a = new Addition();
		System.out.println("i="+a.i);
		System.out.println("j="+a.j);
		a.add();
		a.display();
		
	//	parameterized constructor
		Addition a1=new Addition(15,12);
		System.out.println("i="+a1.i);
		System.out.println("j="+a1.j);
		a1.add();
		a1.display();

	}

}
