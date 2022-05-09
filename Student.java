package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	Course  course;

		private int sid;
		private String name;
		public Student() {
			super();
			
			System.out.println("Constructor");
		}
		public Student(int sid, String name) {
			super();
			this.sid = sid;
			this.name = name;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", name=" + name + "]";
		}
		public void display()
		{
			System.out.println("Student display method");
		}
		

	}


