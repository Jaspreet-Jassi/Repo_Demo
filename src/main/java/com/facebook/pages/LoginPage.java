package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.facebook.testbase.TestBase;

public class LoginPage extends TestBase
{
	//changes on github-- changed again
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(id="pass")
	WebElement userPass;
	
	
	public LoginPage()
	{
		PageFactory.initElements(dr, this);
	}
	
	public void login()
	{
		userEmail.sendKeys(pr.getProperty("username"));
		userPass.sendKeys(pr.getProperty("password"));
	}

}
