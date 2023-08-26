package jackson.bus.opensource;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson 
 * MessageBody.java
 *
 * ���� :
 * </pre>
 * 
 * @since : 2020. 10. 4.
 * @author : tobby48
 * @version : v1.0
 */
public class MessageBody {
	@JacksonXmlProperty		//	xml�� ������Ʈ���� ���, ������Ʈ �̸��� �������� ������ ��������� 'busRouteList'�� ����
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<MessageBodyBus> busRouteList;
	
	public MessageBody() {
		// TODO Auto-generated constructor stub
	}
	public List<MessageBodyBus> getBusRouteList() {
		return busRouteList;
	}
	public void setBusRouteList(List<MessageBodyBus> busRouteList) {
		this.busRouteList = busRouteList;
	}

}