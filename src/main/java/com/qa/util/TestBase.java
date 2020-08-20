package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties pro;
	
	public TestBase()
	{
		try {
		pro=new Properties();
		FileInputStream fis= new FileInputStream(
				"C:\\Users\\ssinha\\eclipse-workspace\\AmazonBDDFramework\\src\\main\\java\\com\\qa\\config\\config.properties");
								
									pro.load(fis);
								} catch (IOException e) {
									
									e.getMessage();
								}
	}
		
		public static void initialization()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ssinha\\\\Desktop\\\\driver\\\\chromedriver.exe");
			  driver= new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			  driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_timeout, TimeUnit.SECONDS);
			  driver.get(pro.getProperty("url"));
			
		}
	
	public void closeApplication()
	{
		driver.quit();
	}
	
}
