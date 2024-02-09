package stepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginSteps {
	
	LoginPage loginPage;
	WebDriver driver =new ChromeDriver();
	@Given("I am on the Mokkup AI login page")
	public void i_am_on_the_mokkup_ai_login_page() {
	    driver.get("https://app.mokkup.ai/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

@When("I enter my valid email {string} address and password {string}")
public void i_enter_my_valid_email_address_and_password(String email, String pass) {
        loginPage=new LoginPage();
	    loginPage.getEmail().sendKeys(email);
	    loginPage.getPassword().sendKeys(pass);
	}
	@When("I click the login button")
	public void i_click_the_login_button() {
	    loginPage.getLoginBtn().click();
	}
	@Then("I should be redirected to the dashboard page")
	public void i_should_be_redirected_to_the_dashboard_page() {
		
	    
	}
	
	@When("I should enter an invalid email {string} address or password {string}")
	public void i_should_enter_an_invalid_email_address_or_password(String mail, String pas) {
	    loginPage=new LoginPage();
		loginPage.getEmail().sendKeys(mail);
	    
	    loginPage.getPassword().sendKeys(pas);
	}
	@When("I clicked the login button")
	public void i_clicked_the_login_button() {
		loginPage.getLoginBtn().click();
	}
	@Then("I should see an error message indicating invalid credentials")
	public void i_should_see_an_error_message_indicating_invalid_credentials() {
	    
	}



	

	}
