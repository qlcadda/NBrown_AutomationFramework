package com.testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cname.core.framework.utility.Constants;
import com.cname.core.framework.utility.Global;
import com.cname.core.framework.webdriver.Driver;
import com.cname.core.framework.webdriver.FindBy;
import com.cname.core.framework.webdriver.SeWebDriver;
import com.cname.nbrown.TestInitialization.TestInitializationScript;

public class Test1 extends TestInitializationScript
{

	@Test
	public void searchProTest() throws Exception
	{
		WebDriver driver = Driver.getBrowserInstance();
		seWDriver.maximizeWindow();
		seWDriver.get();
		seWDriver.implicitlyWait();
		
		Thread.sleep(3000);
		
		try
		{
			WebElement w1 = driver.findElement(FindBy.seByMechanism("xpath", "//button[text()='Accept All Cookies']"));
			w1.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		seWElm.setValue("name", "searchString", "I want to Buy Jeans");
		
		
		wb.clickOnButton("id", "searchButton");
		
		
		seWDriver.waitForWebElementToBoVisible("xpath", "(//img[@class='js-plp-image'])[1]");
		
		
		
	}
}
