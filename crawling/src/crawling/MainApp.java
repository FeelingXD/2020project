package crawling;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//jsoup
public class MainApp {
	
    
	public static void main(String[] args )throws Exception {
		
	
		
	    Response doc = Jsoup.connect("http://elearn.gwangju.ac.kr/include/login_ok.jsp")//로그인 페이지에 피라미터값 보내기 
	            .data("user_id", "")//아이디 필드값 :: 피라미터
	            .data("passwd", "")//패스워드 필드값 :: 피라미터
	            .method(Method.POST)//post로 실행하기
	    		.execute();//실행
	    Document myp = Jsoup.connect("http://elearn.gwangju.ac.kr/mypage/mypage.jsp")
	    		.get().getElementById(id)
	    
	    
	    System.out.println(doc.body());
	    
	}
}
 
