package lambda.com;

import java.util.function.Predicate;

public class GreaterNumberusingpredicat {

	public static void main(String[] args) {
		Predicate<Integer>gt=(i)->i>10;
		System.out.println("Number is greater than 10 or not");
		boolean b=gt.test(11);
		if(b)
		{
			System.out.println("Greater than 10");
		}
		else
		{
			System.out.println("Lesser than 10");
		}
		

	}

}
