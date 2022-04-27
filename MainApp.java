package suma.com;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Database Operation");
			System.out.println("****WELCOME TO STUDENT MANAGEMENT SYSTEM****");
			System.out.println("Enter your choice");
			System.out.println("********");
			System.out.println("1.To display Student information");
			System.out.println("2.Insert Student Record ");
			System.out.println("3.update Student Record Based on ID");
			System.out.println("4.Delete Student Record Based on ID ");
			System.out.println("5.Select Student Information Based on ID");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:StudentDataOperation.displayStudentInfo();
			        break;
			case 2:StudentDataOperation.insertStudentinfo();
			        break;
			case 3:StudentDataOperation.updateStudentinfo();
			        break;
			case 4:StudentDataOperation.deleteStudentinfo();
			        break;
			case 5:StudentDataOperation.selectStudentInfo();
			        break;
			default:System.out.println("Invalid choice...");
			}
			
			System.out.println("DO YOU WANT TO CONTINUE yes/no");
			
			System.out.println("************");



            String choice=sc.next();
            if(choice.equalsIgnoreCase("no")) {
            	break;
            }//if


			}//while
			
           System.out.println("Program terminated");
			System.out.println("************");
			System.out.println("THANKS FOR USING THIS APPLICATION");



	}

}
