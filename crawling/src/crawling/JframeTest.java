package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
}
public Document executelogin(String user , String password) {
	try {
		Connection.Response loginFoarm = Jsoup.connect("http://elearn.gwangju.ac.kr/index.jsp")
				.method(Connection.Method.GET)
				.execute();
		
		Document mainPage = (Document) Jsoup.connect("http://elearn.gwangju.ac.kr/index.jsp")
			.data("user_id", user)
			.data("passwd", password)
			.cookies(loginForm()).execute()
			.followRedirects(True)
			.method(Connection.Method.POST).execute();
		
		System.out.println(mainPage.parse());
		
		Document evaluationPage = Jsoup.connect("https://backoffice.holidayinsider.com/backoffice2/")
	               .cookies(cookies)
	               .get();
	           System.out.println(evaluationPage);
		
		
			
	}catch (IOException e) {
		
		e.printStackTrace();
	}


	
}
	
