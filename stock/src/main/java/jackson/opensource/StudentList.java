package jackson.opensource;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson
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
public class StudentList {
	private List<Student> students;
	private String academyName;
	private String location;
}