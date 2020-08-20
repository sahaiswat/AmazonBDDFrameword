package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[contains(.,'swati sinha')]")
	WebElement usernamelabel;
	@FindBy(xpath = "//span[contains(.,'Home')]")
	WebElement Home;
	@FindBy(xpath = "//span[contains(.,'Calendar')]")
	WebElement Calender;
	@FindBy(xpath = "//span[contains(.,'Deals')]")
	WebElement Deals;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
		public boolean VerifyCorrectUserName()
		{
			return usernamelabel.isDisplayed();
		}

		
		}
