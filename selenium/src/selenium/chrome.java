package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"	, "c:/c.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.co.kr");
		
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
	}
}
