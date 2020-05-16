package autologin;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class autologin {
	private static WebDriver driver;
	private static WebElement text_box_id;// 로그인 아이디 박스 
	private static WebElement text_box_pw;//로그인 패스워드 박스
	private static WebElement btn_login;//로그인 submit button
	private static WebElement chk_oneday;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//브라우저 드라이버 오픈 기왕이면 절대주소를 사용하는것이 범용성에는 좋음 하지만 개인 프로젝트용  setProperty 값은 개인 웹드라이버 따라 다르게 설정해주세요
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ghpro\\Desktop\\지민\\jimin(깃)\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		Thread.sleep(500);//0.5초 쉬기;
		
		driver.get("http://elearn.gwangju.ac.kr/index.jsp");
		//오늘하루 팝업창 끄기 몽땅
		chk_oneday=driver.findElement(By.cssSelector("input:not(:checked)[type='checkbox']"));
		chk_oneday.click();
		//로그인폼 채우기
		text_box_id=driver.findElement(By.cssSelector("input[name='user_id']"));
		text_box_id.clear();
		text_box_id.sendKeys("아이디");
		//비밀번호
		text_box_id=driver.findElement(By.cssSelector("input[name='passwd']"));
		text_box_id.clear();
		text_box_id.sendKeys("비밀번호");
		Thread.sleep(500);//0.5초 쉬기;
		
		btn_login=driver.findElement(By.cssSelector("input[class='btn_login']"));
		btn_login.click();
		
	}
	

}
