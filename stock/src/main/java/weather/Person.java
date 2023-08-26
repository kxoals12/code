package weather;

import javax.persistence.*;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.hibernate.annotation
 * Person.java
 *
 * ���� : ���̹�����Ʈ ������̼� ����2
 * </pre>
 * 
 * @since : 2017. 10. 26.
 * @author : tobby48
 * @version : v1.0
 */
@Entity
@Table(name = "weather")
public class Person {
   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   @Column(name = "city")
   private String city;

   @Column(name = "time")
   private String time;

   @Column(name = "weather")
   private String weather;  

   public Person() {}
   
   
}