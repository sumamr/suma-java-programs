package suma.com;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class MainApphibernate {

	public static void main(String[] args) {
		//Student sob=new Student();
		//sob.setSid(1);
		//sob.setSname("Sudha");
					
 Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class);		        
 ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
 SessionFactory sf=conn.buildSessionFactory(reg);
 Session sess=sf.openSession();
 Transaction tx=sess.beginTransaction();
 //to get the record based on id
 //select * from edustudent where sid=1
 
 //Student s=  (Student) sess.get(Student.class,1);
 //System.out.println(s);
 
	// for retrieve all records
 //Query q=sess.createQuery("from Student");// Student is a class name
 //Iterator<Student> s=q.iterate();
 //while(s.hasNext()) {
	// Student st=s.next();
	 //System.out.println(st.getSid()+" "+st.getSname());
 //}
 
 
 //for deleting a record
 Student s=new Student();
 s.setSid(4);
 sess.delete(s);
 //sess.save(sob);
tx.commit();


			}

		}


	


