package suma.com;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet
{
	String sname;
	int sid;
	int marks;
	public StudentTreeSet(String sname, int sid, int marks) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.marks = marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
class StudentMarksCompare implements Comparator<StudentTreeSet>
{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		return o1.marks-o2.marks;
	}
	
}
class StudentIdCompare implements Comparator<StudentTreeSet>
{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		return o1.getSid()-o2.getSid();
	}
	
}
class StudentNameCompare implements Comparator<StudentTreeSet>
{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		return o1.getSname().compareTo(o2.getSname());
	}
	
}

public class TreeSetforcustomClass {

	public static void main(String[] args) {
		TreeSet<StudentTreeSet> ob=new TreeSet<StudentTreeSet>(new StudentMarksCompare());
		StudentTreeSet tob1 =new StudentTreeSet("Suma",30,4734);
		StudentTreeSet tob2 =new StudentTreeSet("Ramya",20,3234);
		StudentTreeSet tob3 =new StudentTreeSet("Bhoomika",07,4134);
		ob.add(tob1);
		ob.add(tob2);
		ob.add(tob3);
		
		System.out.println("Sorting based on marks");
		Iterator<StudentTreeSet> it1=ob.iterator();
		while(it1.hasNext())
		{
			StudentTreeSet sob=it1.next();
			System.out.println(sob.getSname()+" "+sob.getSid()+" "+sob.getMarks());
		}
		
		TreeSet<StudentTreeSet> ob1=new TreeSet<StudentTreeSet>(new StudentIdCompare());
		StudentTreeSet tob4=new StudentTreeSet("Supriya",36,1200);
		StudentTreeSet tob5=new StudentTreeSet("Sushma",33,1050);
		StudentTreeSet tob6=new StudentTreeSet("Sunita",46,6000);
		ob1.add(tob4);
		ob1.add(tob5);
		ob1.add(tob6);
		
		System.out.println("Sorting based on ID");
		Iterator<StudentTreeSet>it2=ob1.iterator();
		while(it2.hasNext())
		{
			StudentTreeSet sob1=it2.next();
			System.out.println(sob1.getSname()+" "+sob1.getSid()+" "+sob1.getMarks());
		}
		
		TreeSet<StudentTreeSet> ob2=new TreeSet<StudentTreeSet>(new StudentNameCompare());
		StudentTreeSet tob7=new StudentTreeSet("Zainab",40,890);
		StudentTreeSet tob8=new StudentTreeSet("Zayba",42,980);
		StudentTreeSet tob9=new StudentTreeSet("yamini",30,990);
		ob2.add(tob7);
		ob2.add(tob8);
		ob2.add(tob9);
		
		System.out.println("Sorting based on Name");
		Iterator<StudentTreeSet>it3=ob2.iterator();
		while(it3.hasNext())
		{
			StudentTreeSet sob3=it3.next();
			System.out.println(sob3.getSname()+" "+sob3.getSid()+" "+sob3.getMarks());
		}
		

	}

}
