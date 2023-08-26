package jackson.annotation.opensource;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.annotaion
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
public class Student {
	//	Serialize ���� ������� 'n'�� JSON�� 'name'Ű�� ����
	//	Deserialize ���� 'name'Ű�� ���� ���� ������� 'n'���� ����
	@JsonProperty("name")
	private String n;
	
	@JsonIgnore		//	Serialize �ÿ� ����, Deserialize �ÿ� �ʱⰪ
	private int age;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)	//	Null�̸� ����
	@JsonProperty("addresses")	//	��������� ������ ��������
	private List<String> addresses;
}