package jackson.opensource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson
 * JacksonJsonMain.java
 *
 * ���� :Jackson Json ����
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
public class JacksonMain {
	
	private ObjectMapper mapper = new ObjectMapper();
	private InputStream is;
	
	@SuppressWarnings("static-access")
	public JacksonMain(){
		is = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream("json.json");
		mapper.setSerializationInclusion(Include.NON_NULL);		//	Serialize �ÿ� ����, Deserialize �ÿ� �ʱⰪ
	}
	
	public void deserialize() throws Exception{
		StudentList value = mapper.readValue(is, StudentList.class);
		System.out.println(value);
	}
	
	public void serialize() throws Exception{
		StudentList list = new StudentList();
		List<Student> studentList = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(18);
		List<String> addressList = new ArrayList<String>();
		addressList.add("����");
		addressList.add("����");
		s1.setAddresses(addressList);
		studentList.add(s1);
		
		Student s2 = new Student();
		s2.setName("�ϸ���");
		s2.setAge(28);
		studentList.add(s2);
		
		list.setStudents(studentList);
		System.out.println(mapper.writeValueAsString(list));
	}
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		JacksonMain jackson = new JacksonMain();
		jackson.deserialize();
		jackson.serialize();
	}
}