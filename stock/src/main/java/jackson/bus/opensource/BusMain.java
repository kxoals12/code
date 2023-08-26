package jackson.bus.opensource;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson
 * JacksonJsonMain.java
 *
 * ���� :Jackson Json ����
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
public class BusMain {
	private static ObjectMapper mapper = new XmlMapper();
	public static void main(String[] args) throws Exception  {
		HttpClient client = HttpClients.createDefault();
		HttpGet request = new HttpGet("http://openapi.gbis.go.kr/ws/rest/busrouteservice?serviceKey=1234567890&keyword=11");
		try {
			//	�ʿ信 ���󼭴� ��� �߰�
			//		request.addHeader("Content-type", "application/json");

			//	��û
			HttpResponse response = client.execute(request);

			//	����
			Bus value = mapper.readValue(response.getEntity().getContent(), Bus.class);
			System.out.println(value);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}