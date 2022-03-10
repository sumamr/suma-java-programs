package manju.com;

import java.util.Map;
import java.util.TreeMap;

public class STreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(12, "chetu");
		tm.put(34, "tarun");
		tm.put(87, "renu");
		System.out.println(tm);
		for(Map.Entry m3:tm.entrySet())
		{
			System.out.println(m3.getKey()+" "+m3.getValue());
		}

	}

}
