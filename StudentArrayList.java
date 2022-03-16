package akash.com;

import java.util.ArrayList;
import java.util.Iterator;

class Student1
{
	int sid;
	String sname;
	float fees;
	public Student1(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}
	
	
	
}

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student1> ob=new ArrayList<>();
		Student1 s1=new Student1(12,"madan",6780.70f);
		Student1 s2=new Student1(16,"nithya",9750.79f);
		Student1 s3=new Student1(20,"rakshu",8000.70f);
		ob.add(s1);
		ob.add(s2);
		ob.add(s3);
		System.out.println(ob);	
		Iterator<Student1> sit=ob.iterator();
		while(sit.hasNext())
		{
			Student1 s=sit.next();
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getFees());
		}
		
	}

}
