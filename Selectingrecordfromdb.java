package sumaprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectingrecordfromdb {

	public static void main(String[] args) {
		
		//code to connection between frontend and backend
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/mydatabase";
		String un="root";
		String pa="root";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url, un, pa);
			st=con.createStatement();
			String sql="select * from student";
			rs=st.executeQuery(sql);
			System.out.println("Name\t\tId\t\tEmail\t\tCName");
			while(rs.next())
			{
				String n=rs.getString(1);
				
				String id=rs.getString(2);
				String e=rs.getString(3);
				String cn=rs.getString(4);
				System.out.println(n+"\t\t"+id+"\t\t"+e+"\t\t"+cn);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		

	}

}
