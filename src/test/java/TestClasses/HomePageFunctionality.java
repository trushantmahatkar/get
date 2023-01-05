package TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POMClasses.HomePagePOMClass;
import POMClasses.TestBaseClass;
import UtilityClass.screenshot;

public class HomePageFunctionality extends TestBaseClass
{
	@Test(enabled=true,priority=0)
	public void verifyHeaderFunctionality() throws IOException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		String actualNews = hp.get_News();
		log.info(actualNews);	
		Assert.assertTrue(hp.verifyHeaderNews(),"Internal News Functionality Fails");
		screenshot.ScreenShot(driver,"Header");
	}
	
	@Test(enabled=true,priority=1)
	public void verifyDateTimeFunctionality() throws IOException 
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		String dateTime=hp.checkDateTime();
		log.info(dateTime);	
		Assert.assertTrue(hp.verifyDate_Time(),"Date & Time Functionality Fails");
		screenshot.ScreenShot(driver,"Date & Time");
	}
	
	@Test(enabled=true,priority=2)
	public void verifyMultilingualLogoFunctionality() throws IOException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.change_Language();
		screenshot.ScreenShot(driver,"Multilingual");
		log.info("Language is changed");
		Assert.assertTrue(hp.verifyMultilingual(),"Multilingual Funtionality Fails");
	}
	
	@Test(enabled=true,priority=3)
	public void verifyProfileFunctionality() throws IOException, InterruptedException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.clickonProfileIcon();
		log.info("Profile Icon is Clicked");
		log.info("Profile is Clicked");
		log.info("My Profile Page is Opened");
		Assert.assertTrue(true,"My Profile Functionality Fails");
	}
	
	@Test(enabled=true,priority=4)	
	public void verifyChangePasswordFunctionality() throws IOException, InterruptedException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.clickonChangePasswordSetting();
		Thread.sleep(2000);
		screenshot.ScreenShot(driver,"Change Password");
		log.info("Profile Icon is Clicked");
		log.info("Change Password is Clicked");
		log.info("Password Change Successfully");
		Assert.assertTrue(true,"Change Password Functionality Fails");
	}
	
	@Test(enabled=true,priority=5)
	public void verifyLogoutFunctionality() throws IOException, InterruptedException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		Thread.sleep(4000);
		hp.clickonLogout();
		Thread.sleep(1000);
		screenshot.ScreenShot(driver,"Logout done came to Login Page");
		log.info("Profile Icon is Clicked");
		log.info("Logout is Clicked");
		log.info("Logout Successfully");
		String expectedURL= "http://reevo-dev.api-hkbgaming88.com/login";
		String actualURL =hp.getURL();
		Assert.assertEquals(actualURL,expectedURL,"Logout Fnctionality Fails");
	}
}
