package com.sailpoint.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ts.commons.Page;

/**
 * This page have the menu bar and the common web elements between all the pages, a kind of master page in .NET
 * All the pages that have the menu bar should extend this page, in this way you do not need create the same web elements in each page
 */
public class MasterPage extends Page
{
	@FindBy(xpath = "//a[@href='/identityiq/home.jsf']")
	protected WebElement homeMenu;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
	protected WebElement identitiesMenu;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[3]")
	protected WebElement applicationsMenu;
	
	@Override
	public MasterPage and()
	{
		return this;
	}

	@Override
	public MasterPage then()
	{
		return this;
	}

}
