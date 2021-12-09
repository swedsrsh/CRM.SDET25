package com.crm.pomObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationsPage {
	WebDriver driver;
	public OrganisationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrgImg;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreateOrgImg() {
		return createOrgImg;
	}
}