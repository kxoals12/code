package jackson.annotation.opensource;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.annotaion
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
@JsonIgnoreProperties({ "academyName", "location" })	//	Serialize �ÿ� ����, Deserialize �ÿ� �ʱⰪ
public class StudentList {
	@JsonProperty("students")
	private List<Student> student;
	private String academyName;
	private String location;
}