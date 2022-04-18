package preparedStatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DataBaseOperations {
	static Connection myconn=null;
	static PreparedStatement pst=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);

	public static void addRecords() {
	try
	{
		System.out.println("Enter id");
		int sid=sc.nextInt();
		System.out.println("Enter name");
		String n=sc.next();
		System.out.println("Enter course");
		String c=sc.next();
		myconn=DbConnect.getConnection();
		//check id exists or not
		String selsql="select * from edustudent where sid=?";
		pst=myconn.prepareStatement(selsql);
		pst.setInt(1, sid);
		rs=pst.executeQuery();
		if(!rs.next())
		{
			String sql="insert into edustudent values(?,?,?)";
			PreparedStatement pst=myconn.prepareStatement(sql);
			pst.setInt(1, sid);
			pst.setString(2, n);
			pst.setString(3, c);
			
			int i=pst.executeUpdate();
			if(i>0)
			{
				System.out.println("Record is added successfully");
			}
		}
	else
	{
		System.out.println(sid+" already exists");
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	}

	public static void updateRecords() {
		System.out.println("Enter id to update record");
		int id=sc.nextInt();
		try
		{
			myconn=DbConnect.getConnection();
			String sel="select * from edustudent where sid=?";
			pst=myconn.prepareStatement(sel);
			pst.setInt(1, id);
			
			rs=pst.executeQuery();
			
			if(rs.next())
			{
				System.out.println("which field you want to update");
				System.out.println("1.to update name");
				System.out.println("2.to update course");
				System.out.println("3.to update name and course");
				
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1: System.out.println("Enter name to change");
				         String n=sc.next();
				         String cn="update edustudent set sname=? where sid=?";
				         pst=myconn.prepareStatement(cn);
				         pst.setString(1, n);
				         pst.setInt(2, id);
				         int i=pst.executeUpdate();
				         
				         if(i>0)
				         {
				        	 System.out.println("Name is changed");
				         }
				         break;
				 case 2:System.out.println("Enter the course to change");
				          String c=sc.next();
				          String csql="update edustudent set scourse=? where sid=?";
				          pst=myconn.prepareStatement(csql);
				          pst.setString(1, c);
				          pst.setInt(2, id);
				          int j=pst.executeUpdate();
				          if(j>0)
				          {
				        	  System.out.println("Course is changed");
				          }
				          break;
				 case 3:  System.out.println("Enter name");
				           String un=sc.next();
				           System.out.println("Enter Course name");
				           String couch=sc.next();
				           
				           String cnchange="update edustudent set sname=?,scourse=? where sid=?";
				           pst=myconn.prepareStatement(cnchange);
				           pst.setString(1,un);
				           pst.setString(2, couch);
				           pst.setInt(3,id);
				           int k=pst.executeUpdate();
				           if(k>0)
				           {
				        	   System.out.println("Name and course is changed");
				           }
				           
				      	}
			}
			else
			{
				System.out.println(id+" not exists");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void displayRecords() {
		try
		{
			myconn=DbConnect.getConnection();
			String sql="select * from edustudent";
			pst=myconn.prepareStatement(sql);
			rs=pst.executeQuery();
			System.out.println("Id\tName\tCourse");
			while(rs.next())
				{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	            }
		
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}

	

}
}
