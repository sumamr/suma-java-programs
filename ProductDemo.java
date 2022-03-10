package suma.com;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Product
{
	int pid;
	String pname;
	float price;
	int quantity;
	public Product(int pid, String pname, float price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
class ProductIdCompare implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPid()-o2.getPid();
	}
	
}


public class ProductDemo {

	public static void main(String[] args) {
		TreeSet<Product> tr=new TreeSet<Product>(new ProductIdCompare());
		
		Product p1=new Product(4,"Laptop",15000,1);
		Product p2=new Product(65,"book",30,15);
		Product p3=new Product(2,"phone",1000,2);
		tr.add(p1);
		tr.add(p2);
		tr.add(p3);
		Iterator<Product> it2=tr.iterator();
		while(it2.hasNext())
		{
			Product pd=it2.next();
			System.out.println("pid = "+pd.getPid()+" Name = "+pd.getPname()+" price = "+pd.getQuantity());
		}

	}

}





