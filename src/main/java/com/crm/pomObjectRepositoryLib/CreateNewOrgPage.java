package com.crm.pomObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	WebDriver driver;
	public CreateNewOrgPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement createOrgNameText;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateOrgNameText() {
		return createOrgNameText;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
