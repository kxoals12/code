package weather;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.hibernate.annotation
 * Query2.java
 *
 * 설명 : 하이버네이트 어노테이션 예제2 테스트
 * </pre>
 * 
 * @since : 2017. 10. 26.
 * @author : tobby48
 * @version : v1.0
 */
public class Que {

	private static SessionFactory sessionFactory; 
	
//	public Integer addPerson(String fname, String lname, int salary){
//		
//		return personID;
//	}
	public static void main( String[] args ){
		sessionFactory = HibernateAnnotationUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer personID = null;
		try {
			tx = session.beginTransaction();
			Person person = new Person();
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setSalary(salary);
			personID = (Integer) session.save(person); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		Que query = new Que();

		
		sessionFactory.close();
	}
}