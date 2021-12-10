package com.crm.GenericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.pomObjectRepositoryLib.HomePage;
import com.crm.pomObjectRepositoryLib.LoginPage;

public class BaseClass {

	public WebDriver driver= null;
	@BeforeClass
	public void configBeforeClass()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void configBeforeMethod() {
		driver.get("http://localhost:8888/");
		LoginPage l= new LoginPage(driver);
		l.getUsername().sendKeys("admin");
		l.getPassword().sendKeys("admin");
		l.getLoginButton().click();
	}
	@AfterMethod
	public void configAfterMethod() {
		
	HomePage home= new HomePage(driver);
		WebElement element = home.getSingOutImg();
		Actions actioin = new Actions(driver);
		actioin.moveToElement(element).perform();
		home.getSingOut().click();
	}
	@AfterMethod
	public void configAfterClass()
	{
		driver.close();
	}
}
