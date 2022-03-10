package zayba.com;

public class Numberformatexception {

	public static void main(String[] args) {
		String s="suma";
		System.out.println("Before parseInt");
		try {
		int i=Integer.parseInt(s);//monitor statement
		}
		catch(NumberFormatException e2)
		{
			System.out.println("NumberFormatException will occurs");
			e2.printStackTrace();
		}
		System.out.println(s);

	}

}
