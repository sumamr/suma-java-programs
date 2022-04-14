package suma.com;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //create table Student
@Table(name="edustudent")//different table name in database
public class Student {
	@Id   //primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//to generate primary key automatically
	@Column(name="edustid")//not null
	private int sid;
	
	@Column(name="edustname",nullable=false,length=30)
	private String sname;
	//generate setter and getter method 
	//generate toString
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
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";

		}

	}



