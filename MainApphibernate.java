package suma.com;
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
 
 Student s=  (Student) sess.get(Student.class,1);
 System.out.println(s);
 
			        
 //sess.save(sob);
tx.commit();


			}

		}


	


