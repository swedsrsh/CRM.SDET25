package com.crm.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.pomObjectRepositoryLib.CreateNewOrgPage;
import com.crm.pomObjectRepositoryLib.HomePage;
import com.crm.pomObjectRepositoryLib.LoginPage;
import com.crm.pomObjectRepositoryLib.OrganisationsPage;

public class OrgPractice extends BaseClass{

	@Test
	public void createorg() throws InterruptedException
	{
		
		
		RemoteWebDriver driver = null;
		HomePage home= new HomePage(driver);
		home.getOrganisationbutton().click();
		OrganisationsPage org= new OrganisationsPage(driver);
		org.getCreateOrgImg().click();
		
		CreateNewOrgPage cnorg= new CreateNewOrgPage(driver);
		cnorg.getCreateOrgNameText().sendKeys("abddfff");
		cnorg.getSaveButton().click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}
}
