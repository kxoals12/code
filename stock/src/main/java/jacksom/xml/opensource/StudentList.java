package jacksom.xml.opensource;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.xml
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
@JacksonXmlRootElement(localName = "students")	//	��Ʈ ������Ʈ �̸�
public class StudentList {
	@JacksonXmlProperty		//	xml�� ������Ʈ���� ���, ������Ʈ �̸��� �������� ������ ��������� 'student'�� ����
    @JacksonXmlElementWrapper(useWrapping = false)	//	�÷��ǿ� ��Ұ� ���� �� ��������, �� ������Ʈ ����
	private List<Student> student;
}