package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static  WebDriver  browser(String url){
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//driver.navigate().to("https://www.facebook.com/");
				driver.get(url);
				return driver;
				
	}
}
