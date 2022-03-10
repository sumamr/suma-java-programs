package manju.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class SLinkedHashMap {

	public static void main(String[] args) {
	  LinkedHashMap<Integer,String> lm=new LinkedHashMap<Integer,String>();
	  lm.put(6, "iqra");
	  lm.put(9, "rachhu");
	  lm.put(4, "suma");
	  System.out.println(lm);
	  for(Map.Entry m1:lm.entrySet())
	  {
		  System.out.println(m1.getKey()+" "+m1.getValue());
	  }

	}

}
