package suma.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDataOperation {
	static Connection scon;
	static ResultSet rs;
	static Statement st;
	static Scanner sc=new Scanner(System.in);
	static int sid;
	static String sname;
	static String scourse;
	static long scontactnumber;
	static String semail;
	static String saddress;
	static String sfathername;
	static String smothername;
	static float scoursefees=20500;
		
	public static void displayStudentInfo() {
		try
		{
			scon=Dbconnect.getConnection();
			st=scon.createStatement();
			String sql="select * from student";
			rs=st.executeQuery(sql);
			System.out.println("ID\tNAME\tCOURSE\tCONTACT NUMBER\tEMAILID\tADDRESS\tFATHERNAME\tMOTHERNAME\tCOURSE FEES");
			while(rs.next()) 
			{
		      System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+rs.getLong(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getFloat(9));
	
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
		
    public static void insertStudentinfo() {
    try {
			
			scon=Dbconnect.getConnection();
			st=scon.createStatement();
			System.out.println("My connection"+scon);
				//input data
			System.out.println("Enter id of Student");
			sid=sc.nextInt();
			//check id exists
			String sql="select* from student where sid="+sid;
			rs=st.executeQuery(sql);
			if(!rs.next()) 
			{
				System.out.println("Enter a name");
				sname=sc.next();
				System.out.println("Enter a course");
				scourse=sc.next();
				System.out.println("Enter a contact number");
				scontactnumber=sc.nextLong();
				System.out.println("Enter a email ID");
				semail=sc.next();
				System.out.println("Enter a address of a student");
				saddress=sc.next();
				System.out.println("Enter a fathername");
				sfathername=sc.next();
				System.out.println("Enter a mothername");
				smothername=sc.next();
				System.out.println("enter a course fees");
				scoursefees=sc.nextFloat();
			if(scoursefees<20500) 
			{
				System.out.println("Fees is not completed");
			}
			else if(scoursefees>20500)
			{
				System.out.println("Amount is more than fees");

			}
			else if(scoursefees==20500) 
			{
				System.out.println("Fees completly paid");
		        String ins="insert into student values("+sid+",'" +sname+"','" +scourse+"'," +scontactnumber+",'" +semail+"','"+saddress+"','" +sfathername+"','"+smothername+"',"+scoursefees+")";
                int i=st.executeUpdate(ins);
                if(i>0) 
                {
        	       System.out.println("Student information is registered Successfully");
                }
                else
                {
        	       System.out.println("ID alredy exists choose another id");
                }
            }
			}
				
			
		}
       catch(Exception e) 
       {
			e.printStackTrace();
		}
		
	}
		


	public static void updateStudentinfo() {
		System.out.println("Enter student id to update record");
        sid=sc.nextInt();
		scon=Dbconnect.getConnection();
		try 
		{
			
            st=scon.createStatement();
			String sql="select * from student where sid="+sid;
			rs=st.executeQuery(sql);
			if(rs.next())
			{
			    System.out.println("Which field you want to update");
			    System.out.println("1.to update name");
			    System.out.println("2.to update course");
		    	System.out.println("3.to update contact number");
		    	System.out.println("4.to update email ID");
		    	System.out.println("5.to update address");
			    int choice=sc.nextInt();
	      switch(choice)
	      {
	        case 1: System.out.println("Enter a name to change");
	              String n=sc.next();
	              String up="update student set sname=' " +n+"' where sid="+sid;
	              int i=st.executeUpdate(up);
	              if(i>0)
	              {
	    	         System.out.println("Name is changed");
	              }
	              break;
	      
	      case 2:System.out.println("Enter course to change");
	             String c=sc.next();
	             String cup="update student set scourse=' " +c+"' where sid="+sid;
	            int cr=st.executeUpdate(cup);
	            if(cr>0) 
	      {
	    	  System.out.println("Course is changed");
	      }
	      break;
	      case 3:System.out.println("Enter a contact number to change");
	             long cor=sc.nextLong();
	             String ap="update student set scontactnumber=' " +cor+"' where sid="+sid;
	             int na=st.executeUpdate(ap);
	             if(na>0) 
	             {
	    	        System.out.println("Contact number is changed");
	             }
	      
	      break;
	      case 4:System.out.println("Enter a email to change");
	             String cp=sc.next();
	             String a="update student set semail=' " +cp+"' where sid="+sid;
	             int re=st.executeUpdate(a);
	             if(re>0)
	             {
	         	   System.out.println("email is updated");
	             }
	             break;
	      case 5:System.out.println("enter a address to change");
	             String s=sc.next();
	             String x="update student set saddress=' " +s+"' where sid="+sid;
	             int pa=st.executeUpdate(x);
	             if(pa>0) 
	             {
	    	       System.out.println("your address is changed");
	             }
	             break;
	      }
		}
		else 
		{
				System.out.println(sid+" not exists");

		}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void deleteStudentinfo() {
		System.out.println("Enter student id to delete record");
		int id=sc.nextInt();
		//check id exists
		//if exists go for delete else display id not exists
		
		scon=Dbconnect.getConnection();
		try
		{
			st=scon.createStatement();
			
			String sql = "select * from student where sid="+id;
			rs=st.executeQuery(sql);
				
			if(rs.next()) 
			{
				String del = "delete from student where sid="+id;
				int i=st.executeUpdate(del);
				if(i>0)
				{
					System.out.println("The student with id "+id+" is deleted");
				}
			}
			else 
			{
				System.out.println(id+ " not exists in database");
			}
			
			
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		

	}

	public static void selectStudentInfo() {
		//based on ID
		try
		{
			scon=Dbconnect.getConnection();
			st=scon.createStatement();
			System.out.println("Enter Student ID to display information");
			sid=sc.nextInt();
			String sql="select * from student where sid="+sid;
			rs=st.executeQuery(sql);
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"t"+rs.getFloat(9));
			}
			else
			{
				System.out.println("ID not exists");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
