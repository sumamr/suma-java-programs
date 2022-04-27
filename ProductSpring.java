package com.edu;

public class ProductSpring {
	private int pid;
	private String pname;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void display()
	{
		System.out.println("Product ID = "+pid);
		System.out.println("Product Name = "+pname);
	}
	
	

}
