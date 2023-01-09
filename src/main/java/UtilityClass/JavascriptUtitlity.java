package UtilityClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptUtitlity 
{
	public static void scrollDown(WebDriver driver)
	
	{
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
}
