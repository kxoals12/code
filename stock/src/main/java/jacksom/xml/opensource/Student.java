package jacksom.xml.opensource;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.xml
 * Student.java
 *
 * ���� :Jackson ����
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
@Data
@JacksonXmlRootElement(localName = "student")	//	��Ʈ ������Ʈ �̸�
public class Student {
	//	Serialize ���� ������� 'n'�� XML�� 'name'������Ʈ�� ����
	//	Deserialize ���� 'name'������Ʈ�� ���� ���� ������� 'n'���� ����
	@JacksonXmlProperty(localName = "name")
	private String n;
	private int age;
	private List<String> addresses;
}