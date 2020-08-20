package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultipleSignInStepDefinition {

	WebDriver driver;
	@Given("^User is already on Sign In Page$")
	public void user_is_already_on_Sign_In_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.primevideo.com/?ref_=dvm_pds_amz_NZ_kc_s_g|c_231819499191_m_hKKfi7VN-dc_s__");
		
	}

	@When("^Title of Sign In Page is Amazon$")
	public void title_of_Sign_In_Page_is_Amazon() {
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Then("^User clicks on Sign In Button$")
	public void user_clicks_on_Sign_In_Button() {
		driver.findElement(By.xpath("(//a[contains(.,'Sign In')])[1]")).click();
	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("ap_email")).sendKeys("userid");
		driver.findElement(By.id("ap_password")).sendKeys("passid");
	}
	
	@Then("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() {
		driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]")).click();
	}
		
		@Then("^User is on LoginPage$")
		public void User_is_on_LoginPage() {
			String title1=driver.getTitle();
			System.out.println(title1);
		
	}

	@Then("^Closes the applicaion$")
	public void closes_the_applicaion() {
		driver.quit();
	}

	


}
