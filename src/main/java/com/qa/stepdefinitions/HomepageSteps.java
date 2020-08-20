package com.qa.stepdefinitions;


import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user opens the browser$")
	public void user_opens_browser() {
		TestBase.initialization();
	}
		
		@Then("^user is on login page$")
		public void user_is_on_login_page() {
			
			String title=loginpage.ValidateLoginpageTitle();
			System.out.println("Title of the page is "+title);
	    
	}

	@Then("^user logs into app$")
	public void user_logs_into_app() {
		
		loginpage.login(pro.getProperty("username"), pro.getProperty("password"));
	}

	@Then("^Verifies Homepage title$")
	public void Verifies_Homepage_title() {
		
		boolean userlabel=homepage.VerifyCorrectUserName();
		Assert.assertTrue(userlabel);
	}
}
