package annotation_weather;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.hibernate.annotation
 * Query1.java
 *
 * ���� : ���̹�����Ʈ ������̼� ����1 �׽�Ʈ
 * </pre>
 * 
 * @since : 2017. 10. 26.
 * @author : tobby48
 * @version : v1.0
 */
public class Weather {
	public static void main( String[] args ){
        SessionFactory sessionFactory = HibernateAnnotationUtil.getSessionFactory();

        CompositeCart cart = new CompositeCart();
        ItemKey key = new ItemKey(1, "�׽�Ʈ�Դϴ�.");
        cart.setId(key);
        cart.setUu("abc");
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cart);
        session.getTransaction().commit();
        System.out.println("Insert completed");

        session.close();
        
        sessionFactory.close();
    }
}