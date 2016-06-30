package com.sailpoint.testing.testcases;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.sailpoint.testing.data.Constants;
import com.sailpoint.testing.pages.LoginPage;
import com.ts.commons.TestCaseUtil;
import com.ts.commons.TSPageFactory.PageFactory;

public class MandTTestCase extends TestCaseUtil
{
	protected WebDriver driver;
	protected LoginPage loginPage;
	
	@BeforeSuite ( alwaysRun = true )
	@Parameters({"automationfile"})
	public void initFramework( @Optional("automation.properties") String configfile ) throws Exception
	{
		Properties properties = new Properties();
		FileInputStream conf = new FileInputStream(configfile);
		properties.load(conf);
		
		Constants.setUrl( properties.getProperty("url").toString() );
		Constants.setAdminUser( properties.getProperty("admin_user").toString() );
		Constants.setAdminPassword( properties.getProperty("admin_password").toString() );
	}
	
	@BeforeMethod ( alwaysRun = true )
	public void setup() throws Exception
	{
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();  
		driver.get(Constants.URL);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@AfterMethod ( alwaysRun = true )
	public void close() throws Exception
	{
		/*driver.manage().deleteAllCookies();
		driver.quit();*/
	}

}
