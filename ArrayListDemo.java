package akash.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList<>();
		ob.add("First");
		ob.add("Second");
		ob.add("Third");
		System.out.println(ob);
		ob.add("random");
		Iterator it=ob.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
