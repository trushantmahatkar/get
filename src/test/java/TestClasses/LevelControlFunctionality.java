package TestClasses;

import org.testng.annotations.Test;

import POMClasses.LevelControlPOMClass;
import POMClasses.TestBaseClass;

public class LevelControlFunctionality extends TestBaseClass 
{
	@Test
	public void verifyAddLevelFunctionality()
	{
		LevelControlPOMClass lc = new LevelControlPOMClass(driver);
		lc.clickOperatorSetting();
		lc.clickAddLevelButton();
		lc.sendLevelName();
		lc.clickCheckbox();
	}
}
