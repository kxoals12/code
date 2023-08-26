package jackson.opensource;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson
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
	private String name;
	private int age;
	private List<String> addresses;
}