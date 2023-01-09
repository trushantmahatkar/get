package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass 
{
	public WebDriver driver;
	public LoginPomClass(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@placeholder='Enter username']")
	private WebElement userName;
	
	public void sendUserName()
	{
		userName.sendKeys("TRUSHANT");
	}
	@FindBy(xpath="//input[@placeholder='Enter password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("Test@1234");
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
