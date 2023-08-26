package jacksom.xml.opensource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.xml
 * JacksonXmlMain.java
 *
 * ���� :Jackson ����
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
public class JacksonMain {
	
	private ObjectMapper mapper = new XmlMapper();
	private InputStream is;
	
	@SuppressWarnings("static-access")
	public JacksonMain(){
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		/**
		 * 	SerializationFeature.INDENT_OUTPUT �ɼ���,
		 * <Student>
  				<name>����</name>
  				<age>18</age>
			</Student>
			���·� ���
		 * */
		is = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream("xml.xml");
	}
	
	public void deserialize() throws Exception{
		StudentList value = mapper.readValue(is, StudentList.class);
		System.out.println(value);
	}
	
	public void serialize() throws Exception{
		StudentList list = new StudentList();
		List<Student> studentList = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setN("����");
		s1.setAge(18);
		List<String> addressList = new ArrayList<String>();
		addressList.add("����");
		addressList.add("����");
		s1.setAddresses(addressList);
		studentList.add(s1);
		
		Student s2 = new Student();
		s2.setN("�ϸ���");
		s2.setAge(28);
		studentList.add(s2);
		
		list.setStudent(studentList);
		System.out.println(mapper.writeValueAsString(list));
	}
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		JacksonMain jackson = new JacksonMain();
		jackson.deserialize();
		jackson.serialize();
	}
}