package com.crm.pomObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganisationbutton() {
		return organisationbutton;
	}

	public WebElement getSingOutImg() {
		return singOutImg;
	}

	public WebElement getSingOut() {
		return singOut;
	}
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Organizations']")
	private WebElement organisationbutton;
	
	@FindBy(xpath="//td[@class='genHeaderSmall']/following-sibling::td/img[@src='themes/softed/images/user.PNG']")
	private WebElement singOutImg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
    private WebElement singOut;	

}