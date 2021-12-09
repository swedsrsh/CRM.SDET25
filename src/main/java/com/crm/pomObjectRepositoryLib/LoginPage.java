package com.crm.pomObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(name="user_name")
private WebElement username;

@FindBy(name="user_password")
private WebElement password;
public WebDriver getDriver() {
	return driver;
}

public WebElement getLoginButton() {
	return loginButton;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

@FindBy(id="submitButton")
private WebElement loginButton;

}
