package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement userid;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement pass;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement login;

  public LoginPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  
  public void EnterUserName(String username) {
	  userid.sendKeys(username);
  }
  public void EnterPasswors(String password) {
	  pass.sendKeys(password);
  }
  public void Clicklogin() {
	  login.click();
  }
}



 