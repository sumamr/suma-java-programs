package akash.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee
{
	String ename;
	int eid;
	float sal;
	public Employee(String ename, int eid, float sal) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	
}
class EmployeeIdCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.eid-o2.eid;
	}
	
}
class EmployeeNameCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEname().compareTo(o2.getEname());
	}
	
}
class EmployeeSalCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSal()==o2.getSal())
		{
			return 0;
		}
		else if(o1.getSal()>o2.getSal()) {
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}


public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> e=new ArrayList<>();
		Employee e1=new Employee("suma",30,30000f);
		Employee e2=new Employee("zainab",40,25000f);
		Employee e3=new Employee("sudha",28,45000f);
		e.add(e1);
		e.add(e2);
		e.add(e3);
		System.out.println(e);
		System.out.println("sorting based on employee id");
		
		Collections.sort(e, new EmployeeIdCompare());
		Iterator<Employee> it=e. iterator();
		while(it.hasNext())
		{
			Employee s=it.next();
			System.out.println(s.getEname()+" "+s.getEid()+" "+s.getSal());
		}
		
		System.out.println("sorting based on Name");

		Collections.sort(e,new EmployeeNameCompare());
		Iterator<Employee> it1=e.iterator();
		while(it1.hasNext())
		{
			Employee s1=it1.next();
			System.out.println(s1.getEname()+" "+s1.getEid()+" "+s1.getSal());
		}
		
		System.out.println("sorting based on salary");
		 
		Collections.sort(e,new EmployeeSalCompare());
		Iterator<Employee> it2=e.iterator();
		while(it2.hasNext())
		{
			Employee s2=it2.next();
			System.out.println(s2.getEname()+" "+s2.getEid()+" "+s2.getSal());
		}
		
		
		

	}

}
