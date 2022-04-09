package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have open the application in browser")
	public void i_have_open_the_application_in_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com");
		Thread.sleep(5000);
	    
	}

	@When("I click on the login link")
	public void i_click_on_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in")); //Linktext is locator
		LoginLink.click();
	    
	}

	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("Xyz@abc.com");
	    
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@12345");
	    
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	    
	}

	@Then("I should be landed on the home page")
	public void i_should_be_landed_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Insidehomepage");
	    
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);
	    
	}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	    
	}
	
	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpMsg) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMsg.getText();//used to store the txt on screen
		//String ExpMsg = "The email or password you have entered is invalid.";
		Assert.assertEquals(ExpMsg, ActualMsg);		
	}

}
