package com.trello.qsp.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
public WebDriver driver;
public  Exelutility exelutils=new Exelutility();
public webdriverUtility webDriverUtils=new webdriverUtility();
public JavaUtility javaUtils =new JavaUtility();
public Fileutility fileutils=new Fileutility();
@BeforeMethod
public void configBeforeMethod() throws Throwable
{
	String browserName=fileutils.readcommondata("browser");
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browserName.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	webDriverUtils.implicitWait(driver);
	driver.get(fileutils.readcommondata("url"));
}
@AfterMethod
public void configAfterMethod()
{
	driver.manage().window().minimize();
    driver.quit();	
}


}
