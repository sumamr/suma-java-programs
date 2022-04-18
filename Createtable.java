package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Createtable {
	public static void main(String[] args) {
		String mytable ="create table cloudemp(cid int(4) primary key,cname varchar(20) not null)";
		 
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String un="root";
		String pa="root";
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pa);
			Statement st=con.createStatement();
			st.execute(mytable);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
