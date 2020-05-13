package autologin;

import autologin.Tester;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;


public class MainApp {
	final static  String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36"; 
	final static  String LOGIN_FORM_URL = "http://elearn.gwangju.ac.kr/index.jsp";
	final static   String USERNAME = "20174222";  
	final static   String PASSWORD = "rhwlfks!23";  
	
	
	public static void main(String args[])
	{
		
	
		try {
			Connection.Response loginFormResponse = Jsoup.connect(LOGIN_FORM_URL)
                    .method(Connection.Method.GET)
                    .userAgent(USER_AGENT)
                    .execute();
			// # 로그인 목록채우기
			// ## 로그인필드
			FormElement loginForm = (FormElement)loginFormResponse.parse()
			                                         .select("form.form-signin").first();
			checkElement("Login Form", loginForm);
			//# 아이디
			Element loginField = loginForm.select("input.input_design[name=\"user_id\"").first();
			checkElement("Login Field", loginField);
			loginField.val(USERNAME);
			// ## 패스워드
			Element passwordField = loginForm.select("input.input_design[name=\"passwd\"").first();
			checkElement("Password Field", passwordField);
			passwordField.val(PASSWORD);
			//실행
			Connection.Response loginActionResponse = loginForm.submit()
			         .cookies(loginFormResponse.cookies())
			         .userAgent(USER_AGENT)  
			         .execute();
			//;
			System.out.println(loginActionResponse.parse().html());
			
			
		}catch(Exception e) {
			
			
		}
	}
		
	
	
	
	public static void checkElement(String name, Element elem) {
		    if (elem == null) {
		        throw new RuntimeException("Unable to find " + name);
		    }
		}
		
}