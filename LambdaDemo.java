package lambda.com;

import java.util.ArrayList;

@FunctionalInterface
interface Drawable//functional interface is a interface which has singlw abstract method
{
	void draw();//lambda expression applied to a functional interface
	//with no return type and no argument
}
@FunctionalInterface
interface Sayable{
	void say(String s);//function with argument with no return type
	
}
@FunctionalInterface
interface SayableReturn
{//function with no argument and with return value
	String sayHello();
}
@FunctionalInterface
interface Addition
{//Functioanl interface with argument with return type
	int add(int i,int j);
}
public class LambdaDemo {

	public static void main(String[] args) {
		//using lambda expression
		Drawable dob=()->
		{
			//body of the function
			System.out.println("Draw method body");
		};
		dob.draw();
		
		
		Sayable sob=(s)->//(String s)
		{
			System.out.println("Hello "+s);
		};
		sob.say("chaithalya");
		
		SayableReturn sr=()->{
			return "Hai";
		};
		System.out.println(sr.sayHello());
		
		Addition aob=(i,j)->(i+j);
		System.out.println(aob.add(45,43));
		
		//collection API
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(76);
		a.add(89);
		a.add(100);
		
		a.forEach((n)->System.out.println(n));//Iterating list elements using lambda
		
				

	}

}
