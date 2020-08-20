package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefenition {
	
	WebDriver driver;
	@Given("^User is already on Login Page$")
	public void user_already_on_login_page()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/ap/signin?accountStatusPolicy=P1&clientContext=355-6922007-0119805&language=en_US&openid.assoc_handle=amzn_prime_video_desktop_us&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_encoding%3DUTF8%26location%3D%252Fref%253Dav_nav_sign_in");
	
	}

	@When("^Title of Login Page is Amazon$")
	public void title_of_Login_Page_is_Free_CRM() {
		String title=driver.getTitle();
		System.out.println(title);
		
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("ap_email")).sendKeys("chandrasmi@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("lalok6476");
		
	}
	
	@Then("^User clicks on LoginButton$")
	public void User_clicks_on_LoginButton() {
		driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]")).click();
	
}
	
	@Then("^User is on HomePage$")
	public void User_is_on_HomePage() {
		String title1=driver.getTitle();
		System.out.println(title1);
	}
		
		@Then("^Close the applicaion$")
		public void Close_the_applicaion() {
			driver.quit();
		
		
	}
	
}
