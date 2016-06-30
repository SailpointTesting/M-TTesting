package com.sailpoint.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sailpoint.testing.data.Constants;
import com.ts.commons.Page;
import com.ts.commons.TSPageFactory.PageFactory;

public class LoginPage extends Page
{
	
	@FindBy(xpath = "//input[@id='loginForm:accountId']")
	protected WebElement inputUsername;
	
	@FindBy(xpath = "//input[@id='loginForm:password']")
	protected WebElement inputPassword;
	
	@FindBy(xpath = "//input[@id='loginForm:loginButton']")
	protected WebElement loginButton;
	
	@Override
	public LoginPage and()
	{
		return this;
	}

	@Override
	public LoginPage then()
	{
		return this;
	}
	
	public HomePage loginAdmin(WebDriver driver)
	{
		return login(driver, Constants.ADMIN_USER, Constants.ADMIN_PASSWORD);
	}
	
	public HomePage login(WebDriver driver, String userName, String password)
	{
		this.inputUsername.sendKeys(userName);
		this.inputPassword.sendKeys(password);
		this.loginButton.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
	
}
