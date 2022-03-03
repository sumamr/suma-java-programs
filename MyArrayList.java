package edu.com;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
	  ArrayList<Integer> lst=new ArrayList<>();
	  lst.add(12);
	  lst.add(56);
	  System.out.println(lst);
	  ArrayList<String> l1=new ArrayList<>();
	  l1.add("suma");
	  l1.add("sudha");
	  System.out.println(l1);
	 // lst.clear();
	  ArrayList<Integer> l2=new ArrayList<>();
	  l2.add(516);
	  l2.add(99);
	  l2.add(90);
	  lst.addAll(1,l2);
	  System.out.println(lst);
	  lst.remove(1);
	  System.out.println(lst);

	}

	
	}


