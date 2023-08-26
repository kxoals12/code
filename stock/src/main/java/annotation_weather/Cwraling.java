package annotation_weather;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


public class Cwraling {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요:"); 
//		String stringtValue = scanner.next();
//		System.out.println(stringtValue);
		
		
		try {
			String URL = "https://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109";
			Document doc = Jsoup.connect(URL).get();	
			Elements elements_1 = doc.select("city");

			Elements elements_2 = doc.select("data tmEf");

			Elements elements_3 = doc.select("data wf");
			
//			System.out.println(elements_1.text());
//			System.out.println(elements_2.text());
//			System.out.println(elements_3.text());

			

//			String[] time_to_city = ['time'];
			for( Element element : elements_1) {
				System.out.println(element.text());
			} // for end
			for( Element element : elements_2) {
				System.out.println(element.text());
			} // for end
			for( Element element : elements_3) {
				System.out.println(element.text());
			} // for end

			
			System.out.println("choongang.txt 파일 완성!");			
			
		} catch (Exception e) {
			System.out.println("크롤링 실패 : " + e);
		} // end

	} // main() end
} // class end

