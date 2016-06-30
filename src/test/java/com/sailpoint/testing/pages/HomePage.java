package com.sailpoint.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.sailpoint.testing.data.PageUtils;
import com.ts.commons.Validator;

public class HomePage extends MasterPage
{
	@FindBy(xpath = "//*[@id='ext-gen1035']/div[1]/div[3]/div/div/div/div[1]/div[1]//span[1]")
	protected WebElement homeSpan;
	
	@Override
	public HomePage and()
	{
		return this;
	}

	@Override
	public HomePage then()
	{
		return this;
	}
	
	
	/************************Validators************************/
	
	public Validator verifyHomePage(final WebDriver driver)
	{
		return new Validator()
		{
			@Override
			public void Validate()
			{
				boolean isPresent = PageUtils.isElementPresent(driver, homeSpan);
				Assert.assertTrue(isPresent, "Validation message is not shown");
			}
		};
	}


}
