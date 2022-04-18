package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insertrecord {

	public static void main(String[] args) {
		String name;
		int id;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		name=sc.next();
		System.out.println("Enter id");
		id=sc.nextInt();
		//connection code
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String un="root";
		String pa="root";
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pa);
			Statement st=con.createStatement();
			String ins="insert into login values('"+name+"',"+id+")";
			int i=st.executeUpdate(ins);
			if(i>0)
			{
				System.out.println("Record is inserted successfully");
			}else
			{
				System.out.println("Record is not inserted");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
