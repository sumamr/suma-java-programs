package Studentproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDataOperations {

		static Connection scon=null;
		static ResultSet rs=null;
		static Statement st=null;
		static Scanner sc=new Scanner(System.in);
		static int sid;
		static String sname;
		static String scourse;
		

	public static void insertStudentInfo() {
		try
		{
			scon=Dbconnect.getConnection();
			st=scon.createStatement();
			System.out.println("My Connection "+scon);
			sc=new Scanner(System.in);
			// input from user
			System.out.println("Enter id of student");
			sid=sc.nextInt();
			// check id exists or not
			String sql="select * from edustudent where sid="+sid;
			rs=st.executeQuery(sql);
			if(!rs.next())
			{
				System.out.println("Enter student name");
				sname=sc.next();
				System.out.println("enter student course name");
				scourse=sc.next();
				
				String ins="insert into edustudent values("+sid+",'"+sname+"','"+scourse+"')";
				int i=st.executeUpdate(ins);
				if(i>0)
				{
					System.out.println("Student information is registered");
				}
			}
			else
			{
				System.out.println("ID already exists choose another id");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void updateStudentInfo() {
		//update name,course,name and course
		//taking input id(based on id update records)
		System.out.println("Enter  student id to update record");
		int id=sc.nextInt();
		scon=Dbconnect.getConnection();
		try
		{
			st=scon.createStatement();
			String sql="select * edustudent where sid="+id;
			rs=st.executeQuery(sql);
			if(rs.next())
			{
				System.out.println("Which field you want to update");
				System.out.println("1.to update name");
				System.out.println("2.to update course");
				System.out.println("3.to update name and course");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("Enter name to change");
			            String n=sc.next();
			            String up="update edustudent set sname="+n+" where sid="+id;
			            int i=st.executeUpdate(up);
			            if(i>0)
			            {
			            	System.out.println("name is changed");
			            }
			            break;
				case 2:System.out.println("Enter course to change");
				String c=sc.next();
				String cup="update edustudent set scourse="+c+" where sid="+id;
				int cr=st.executeUpdate(cup);
				if(cr>0)
				{
					System.out.println("Course is changed");
				}
				break;
				case 3:System.out.println("Enter name to change");
				String n1=sc.next();
				System.out.println("Enter course to change");
				String c1=sc.next();
				String upnamecourse="update edustudent set sname="+n1+" ,scourse="+c1+" where sid="+id;
				int ncchange=st.executeUpdate(upnamecourse);
				if(ncchange>0)
				{
					System.out.println("Name and course is changed successfully");
				}
				}
			}
			else
			{
				System.out.println(id+"not exists");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

	public static void deleteStudentInfo() {
		System.out.println("Enter student id to delete the record");
		int id=sc.nextInt();
		//check id exists or not
		// if exists go for delete else display id not exists
		scon=Dbconnect.getConnection();
		try
		{
			st=scon.createStatement();
			String sql="select * from edustudent where sid="+id;
			rs=st.executeQuery(sql);
			
			if(rs.next())
			{
				String del="delete from edustudent where sid="+id;
				int i=st.executeUpdate(del);
				if(i>0)
				{
					System.out.println("The student with id "+id+" is deleted");
					
				}
			}
			else
			{
				System.out.println(id+"not exists in database");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	public static void selectStudentInfo() {
		// based on id
		try
		{
			scon=Dbconnect.getConnection();
			st=scon.createStatement();
			System.out.println("Enter student to display information");
			sid=sc.nextInt();
			String sql="select * from edustudent where sid="+sid;
			rs=st.executeQuery(sql);
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			else
			{
				System.out.println("ID not found");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
public static void displayStudentInfo() {
			
		
	}

	

}
