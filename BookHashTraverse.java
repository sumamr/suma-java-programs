package manju.com;

import java.util.HashMap;
import java.util.Map;

class Book
{
	int bid;
	String bname;
	String aname;
	float price;
	public Book(int bid, String bname, String aname, float price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", aname=" + aname + ", price=" + price + "]";
	}
	
}

public class BookHashTraverse {

	public static void main(String[] args) {
		HashMap<Integer,Book> mp=new HashMap<Integer,Book>();
		Book b1=new Book(18,"c programming","john",500f);
		Book b2=new Book(19,"Java complete Ref","Games",600f);
		Book b3=new Book(20,"Oracle","peter",450f);
		mp.put(2, b1);
		mp.put(5, b2);
		mp.put(7, b3);
		System.out.println(mp);
		//traverse
		for(Map.Entry<Integer,Book> m1:mp.entrySet())
		{
			int k=m1.getKey();
			Book b=m1.getValue();
			System.out.println(b.getBid()+"  "+b.getBname()+" "+b.getAname()+" "+b.getPrice());
			
		}
		

	}

	

}
