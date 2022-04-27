package preparedStatements;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//input from user
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("DataBase operations");
			System.out.println("enter your choice");
			System.out.println("1.To display Student information");
			System.out.println("2.Insert Student record");
			System.out.println("3.Update student information based on id");
			System.out.println("4.Delete student information based on id");
			System.out.println("5.Select Student based on ID");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:DataBaseOperations.displayRecords();
			       break;
			case 2:DataBaseOperations.addRecords();
			          break;
			case 3: DataBaseOperations.updateRecords();
			        break;
			default: System.out.println("invalid choice");
			}
			System.out.println("Do you want to continue yes/no");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("no"))
			{
				break;
			}
		}
		System.out.println("Program terminated");

	}

}
