package manju.com;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Students
{
	String sname;
	int sid;
	float fees;
	public Students(String sname, int sid, float fees) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.fees = fees;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Students [sname=" + sname + ", sid=" + sid + ", fees=" + fees + "]";
	}
	
}

public class StudentTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,Students> tm=new TreeMap<Integer,Students>();
		Students s1=new Students("suma",30,30000f);
		Students s2=new Students("zayba",33,56000f);
		Students s3=new Students("iqra",6,23000f);
		tm.put(5,s1);
		tm.put(7,s2);
		tm.put(2,s3);
		System.out.println(tm);
		//traversing
		for(Map.Entry<Integer,Students> m2:tm.entrySet())
		{
			int k=m2.getKey();
			Students s=m2.getValue();
			System.out.println(s.getSname()+" "+s.getSid()+" "+s.getFees());
		}
		

	}

}
