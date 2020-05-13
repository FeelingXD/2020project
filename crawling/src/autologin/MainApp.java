package autologin;

import autologin.Tester;

import java.io.IOException;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MainApp {
	public static void main(String args[])
	{
		
		try
	       {
	           Response initialResponse;

	           initialResponse = Jsoup.connect("http://elearn.gwangju.ac.kr/index.jsp")
	                   .execute();

	           Response loginResponse = Jsoup
	                   .connect("http://elearn.gwangju.ac.kr/index.jsp")
	                   .cookies(initialResponse.cookies())
	                   .data("user_id", "20174222")
	                   .data("password", "rhwlfks!23")
	                   .data("submit", "asdf")
	                                   .method(Method.POST)
	                   .execute();
	           Document doc = Jsoup.connect("http://elearn.gwangju.ac.kr/index.jsp")
	                   .cookies(loginResponse.cookies()).timeout(3000000).get();

	                  
	           System.out.println(doc);
	       }
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}