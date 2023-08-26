package jackson.architecture;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.architecture 
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
	//	Serialize ���� ������� 'n'�� JSON�� XML�� 'name'���� ����
	//	Deserialize ���� JSON�� XML�� 'name'�� ���� ���� ������� 'n'���� ����
	@JsonProperty("name")
	@JacksonXmlProperty(localName = "name")
	private String n;
	
	@JsonIgnore		//	Serialize �ÿ� ����, Deserialize �ÿ� �ʱⰪ
	private int age;
	
	@JsonProperty("addresses")
	@JsonInclude(JsonInclude.Include.NON_NULL)	//	Null�̸� ����
	private List<String> addresses;
}