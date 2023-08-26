package jackson.architecture;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.architecture 
 * StudentList.java
 *
 * ���� :StudentList ����
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
@Data
@JacksonXmlRootElement(localName = "students")
@JsonIgnoreProperties({ "academyName", "location" })	//	Serializer/Deserialize �� ���ܽ�ų ������Ƽ�� ����
public class StudentList {
	@JacksonXmlProperty		//	xml�� ������Ʈ���� ���, ������Ʈ �̸��� �������� ������ ��������� 'student'�� ����
    @JacksonXmlElementWrapper(useWrapping = false)	//	�÷��ǿ� ��Ұ� ���� �� ��������, �� ������Ʈ ����
	@JsonProperty("students")
	private List<Student> student;
	private String academyName;
	private String location;
}