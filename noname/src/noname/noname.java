package noname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class noname {
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\c.exe");
	    WebElement e = driver.findElement(By.id("click"));
	    System.out.println(e.getAttribute("href")); //prints https://www.google.com
	}
}
