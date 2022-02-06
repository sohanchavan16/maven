package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public void takescreenshot(WebDriver driver, String name) throws IOException {
		// TODO Auto-generated method stub
                  File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	                 File disitination= new File("C:\\Users\\Dell\\eclipse-workspace\\KiteZerodha\\"+name+".png");
	                 FileHandler.copy(sourse, disitination);
	                 
	}
	

}
