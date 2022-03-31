package sumaprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectingrecordfromtable {

	public static void main(String[] args) {

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
			String sql="select * from logins";
			rs=st.executeQuery(sql);
			System.out.println("Name\tID");
			while(rs.next())
			{
				String n=rs.getString("name");
				int id=rs.getInt(2);
				System.out.println(n+"\t"+id);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		}
		
		

	}



