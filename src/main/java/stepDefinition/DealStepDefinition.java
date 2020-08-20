package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is on CRM Login Page$")
	public void User_is_on_CRM_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}

	@When("^Title of page is Free CRM$")
	public void title_of_page_is_Free_CRM() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Then("^User enters user and pass$")
	public void User_enters_username_and_password(DataTable credentials) {
		List<List<String>> data=credentials.raw();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(data.get(0).get(1));
		
		
	}
	
	@Then("^User Logs in$")
	public void User_Logs_in() {
		WebElement loginbutton = driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbutton);
		
	}

	@Then("^User moves to Deals page$")
	public void user_moves_to_Deals_page() {
		driver.switchTo().frame("Twitter settings iframe");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text'][contains(.,'Deals')]"))).build().perform();
		
	}

	@Then("^User clicks on New button$")
	public void user_clicks_on_New_button() {
		
	}

	@Then("^User enters deal details$")
	public void user_enters_deal_details(DataTable dealData)  {
		
	  List<List<String>> dealvalues=  dealData.raw();
	  
	  driver.findElement(By.xpath("//input[contains(@name,'title')]")).sendKeys(dealvalues.get(0).get(0));
	  driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys(dealvalues.get(0).get(1));
	  driver.findElement(By.xpath("//input[contains(@name,'probability')]")).sendKeys(dealvalues.get(0).get(2));
	  driver.findElement(By.xpath("//input[contains(@name,'commission')]")).sendKeys(dealvalues.get(0).get(3));
	  
	   
	}
		
		@Then("^Closes the CRM applicaion$")
		public void Closes_the_CRM_application() {
			driver.quit();
		}
	    
	}


	
	
	

