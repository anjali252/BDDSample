package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMStepDef {
	
	WebDriver driver;
	@Given("User is already on login page")
	public void user_is_already_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
	}
//Simple one
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.name("email")).sendKeys("agrawalanjali65@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Anjali25");
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//	}

//	using data table as list without table header
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable userCred) {
//		// Write code here that turns the phrase above into concrete actions
//		List<String> user=userCred.asList();
//		driver.findElement(By.name("email")).sendKeys(user.get(0));
//		driver.findElement(By.name("password")).sendKeys(user.get(1));
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//	}

	//using data table as maps with table header
		@When("User enters credentials")
		public void user_enters_credentials(DataTable userCred) {
			// Write code here that turns the phrase above into concrete actions
			List<Map<String,String>> data=userCred.asMaps();
			driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}

	@Then("User is on  Home Page")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		boolean isUserDisp=driver.findElement(By.className("user-display")).isDisplayed();
		Assert.assertTrue(isUserDisp);
	}

	@Then("close the browser")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
