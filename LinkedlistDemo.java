package sudha.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(44);
		list.add(90);
		list.add(45);
		list.add(76);
		list.add(23);
		System.out.println(list);
		System.out.println("After adding the elements at first and last position");
		list.addFirst(1);
		list.addLast(100);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		System.out.println("Sublist" +list.subList(2, 5));
		list.add(1, 50);
		System.out.println(list);
		
		Iterator<Integer> it=list.iterator();
		System.out.println("Linked list using Iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		LinkedList<Integer> list1=new LinkedList<>();
		list1=list;
		System.out.println(list1);
		//getting copy of the same list by using clone
		LinkedList<Integer> list2=(LinkedList<Integer>) list.clone();
		System.out.println(list2);
		
				
		
		

	}

}
