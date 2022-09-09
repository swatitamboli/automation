package basetest;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import driverfactory.DriverFactory;
import pages.HomePage;
import pages.LoginPage;
import util.propConfig;
import util.screenshotUtil;



public class BaseTest {

	private DriverFactory df;
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected static Properties prop;
	protected HomePage homePage;
	
	@BeforeTest
	public void setup() throws IOException
	{
		prop = propConfig.loadProperties("ST");
		
	
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		
		df = new DriverFactory();
		 df.init_driver();
		df.getDriver().get(prop.getProperty("baseurl"));
		loginPage = new LoginPage(df.getDriver());
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	

	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		
		System.out.println("In After Method");
		System.out.println(result.getStatus());
		if(result.getStatus() == ITestResult.FAILURE)
		{
			String screenshotName = result.getMethod().getMethodName();
		screenshotUtil.takeScreenshot(df.getDriver(), screenshotName);
			
		}
		df.getDriver().quit();
		
	}
}