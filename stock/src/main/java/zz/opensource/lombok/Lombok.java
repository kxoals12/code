package zz.opensource.lombok;

import java.util.Date;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.lombok
 * Lombok.java
 *
 * ���� :Lombok ����
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
@Data
public class Lombok {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private Date dataOfBirth;
}