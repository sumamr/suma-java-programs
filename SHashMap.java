package manju.com;

import java.util.HashMap;
import java.util.Map;

public class SHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hp=new HashMap<Integer,String>();
		hp.put(16, "suma");
		hp.put(45, "sudha");
		hp.put(78, "zayba");
		System.out.println(hp);
		for(Map.Entry m:hp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"iqra");
		hm.putAll(hp);
		System.out.println(hm);
	}

}
