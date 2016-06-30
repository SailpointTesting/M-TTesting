package com.sailpoint.testing.data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtils
{	
	private static int timeOut = 5;
	
	public static boolean isElementPresent(WebDriver driver, By by)
	{
		return isElementPresent(driver, by, 5);
	}
	 
	public static boolean isElementPresent(WebDriver driver, By by, int waitSeconds)
	{	
		try
		{
			driver.manage().timeouts().implicitlyWait(waitSeconds, TimeUnit.SECONDS);
			driver.findElement(by); 
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
			return true;     
		} catch ( Exception e )
		{
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
			return false;
		}
	}
	
	public static boolean isElementPresent(WebDriver driver,WebElement element)
	{
		return isElementPresent(driver,element, 5);
	}
	
	public static boolean isElementPresent(WebDriver driver, WebElement element, int waitSeconds)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(waitSeconds, TimeUnit.SECONDS);
			element.isDisplayed();
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
			return true;     
		}catch (Exception e)
		{
			return false;
		}
	}

}