package manju.com;

import java.util.Hashtable;
import java.util.Map;

public class SHashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(67, "akash");
		ht.put(89, "sushma");
		ht.put(88, "Ashwini");
		System.out.println(ht);
		ht.putIfAbsent(19, "suma");
		System.out.println("After invoking putIfAbsent() method");
		for(Map.Entry m2:ht.entrySet())
		{
			System.out.println(m2.getKey()+" "+m2.getValue());
		}

	}

}
