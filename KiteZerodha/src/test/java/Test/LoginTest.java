package Test;


import java.io.File;
//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import POM.LoginPage;
import Utilities.Paramertization;
import Utilities.Screenshot;
import pojo.LaunchBrowser;
@Listeners(genral.Listener.class)
public class LoginTest {
	//private static final String name = null;
	//WebDriver driver;
          // static Logger Log=Logger.getLogger(LoginTest.class.getName());
           
	//@BeforeMethod
	
	//public void OpenBrowser() {
	//driver= LaunchBrowser.browser("https://kite.zerodha.com/");
	//}
	
	//@Test
	//public void screen()  {
		//Screenshot s= new Screenshot();
		//s.takescreenshot(driver, name);
		//Log.info("sohanvvvvgghhjh");
		//Log.error("sgsgs");
		//Log.debug("finaly ok");
	//}
	@Test
	public void logintozerodha() throws EncryptedDocumentException, IOException {
	   LoginPage pom = new LoginPage(driver);
	String userName=  Paramertization.getdata(0, 0);
	pom.EnterUserName(userName);
	String password=Paramertization.getdata(1, 1);
	pom.EnterPasswors(password);
	pom.Clicklogin();
	
	@Test
	public void test1() {
		System.out.println("TEST IS START");
	}
	
 @Test(timeOut =1000)
 public void test2() throws InterruptedException {
	 Thread.sleep(3000);
	 System.out.println("FAILD");
 }
	@Test(dependsOnMethods="test2")
	public void god() {
		System.out.println("depends methods");
	}
}



