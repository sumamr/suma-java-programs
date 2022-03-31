package sumaprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordByUser {

	public static void main(String[] args) {
	 
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/mydatabase";
		String un="root";
		String pa="root";
		Connection conn=null;
		Statement st=null;
		String name=null;
		int id=0;
		Scanner sc=new Scanner(System.in);
		String ins=null;
		try
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, un, pa);
			st=conn.createStatement();
			while(true)
			{
				System.out.println("Enter Name");
				name=sc.next();
				System.out.println("Enter ID");
				id=sc.nextInt();
				ins="insert into logins values('"+name+"',"+id+")";
				int i=st.executeUpdate(ins);
				if(i>0)
				{
					System.out.println("Record is inserted successfully");
				}
				else
				{
					System.out.println("Not inserted");
				}
				System.out.println("Do you want to continue y/n");
				char ch=sc.next().charAt(0);
				if(ch=='n')
				{
					break;
				}
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("End of the program");
		
	}

}
