package com.sailpoint.testing.testcases;

import org.testng.annotations.Test;

import com.sailpoint.testing.pages.HomePage;

public class BasicTest extends MandTTestCase
{
	private HomePage homePage;
	
	@Test
	public void login()
	{
		using
		(
			homePage = loginPage.loginAdmin(driver)
		)
		.check
		(
			homePage.verifyHomePage(driver)
		);
	}
}
