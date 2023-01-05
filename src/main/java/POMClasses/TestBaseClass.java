package POMClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UtilityClass.screenshot;

public class TestBaseClass 
{
	public WebDriver driver;
	public Logger log=Logger.getLogger("WL_2.0");
	@BeforeTest
	public void setup() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is Opened");
		driver.manage().window().maximize();
		log.info("Browser is Maximized");
		driver.get("http://reevo-dev.api-hkbgaming88.com/admin-log");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		log.info("URL is Opened");
		screenshot.ScreenShot(driver,"Login Page");
		LoginPomClass lp = new LoginPomClass(driver);
		lp.sendUserName();
		log.info("UserName Entered");
		lp.sendPassword();
		Thread.sleep(10000);
		log.info("Password Entered");
		lp.clickLoginButton();
		log.info("Login Button Clicked");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}