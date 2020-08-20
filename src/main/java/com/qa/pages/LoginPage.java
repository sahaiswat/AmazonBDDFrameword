package com.qa.pages;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


	public class LoginPage extends TestBase{
		
		//Page Factory OR:
		
		@FindBy(name="email")
		WebElement username;
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
		WebElement loginbutton;
		
		//Initializing the Page Objects:
		
		public LoginPage ()
		{
			PageFactory.initElements(driver, this);
		}

		//Actions
		
		public String ValidateLoginpageTitle()
		{
			return driver.getTitle();
		}
		
	public  void  login(String uid, String passid)
	{
		username.sendKeys(uid);
		password.sendKeys(passid);
		//LoginButton
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeAsyncScript("arguments[0].click();", loginbutton);
		
		loginbutton.click();	
	}
		
	}


