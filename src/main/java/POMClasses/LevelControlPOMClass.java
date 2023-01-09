package POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LevelControlPOMClass
{
	public WebDriver driver;
	private Actions act; 
	public LevelControlPOMClass(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
		act= new Actions(driver);
		
	}
	@FindBy(xpath="//span[text()='Operator Setting']")
	private WebElement operatorSetting;
	
	public void clickOperatorSetting()
	{
		operatorSetting.click();
	}
	@FindBy(xpath="//button[text()='Add Level']")
	private WebElement addLevel;
	
	public void clickAddLevelButton()
	{
		addLevel.click();
	}
	@FindBy(xpath="//input[@placeholder='Level Name']")
	private WebElement levelName;
	
	public void sendLevelName()
	{
		levelName.sendKeys("Settings");
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkBox;
			
	public void clickCheckbox()
	{
		checkBox.get(1).click();
		checkBox.get(2).click();
		checkBox.get(12).click();
		checkBox.get(13).click();
		checkBox.get(19).click();
		checkBox.get(20).click();
		checkBox.get(33).click();
		checkBox.get(34).click();  
	}	
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	public void clickSaveButton()
	{
		save.click();
	}
	
	@FindBy(xpath="(//i[@class='bx bx-pencil h3 m-0 text-success'])[7]")
	private WebElement editPensil;
	public void clickeditLevel()
	{
		save.click();
	}

}
