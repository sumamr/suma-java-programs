package suma.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/mydatabase";
	static String un="root";
	static String pa="root";
	static Connection con;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url, un, pa);
			if(con==null)
			{
				System.out.println("Connection object is null");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		

}

	
	
}


