package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	RemoteWebDriver driver;
	
	
	public static WebElement getLogin() {
		return login;
	}
	public static void setLogin(WebElement login) {
		LoginPage.login = login;
	}
	public static WebElement getEmail() {
		return email;
	}
	public static void setEmail(WebElement email) {
		LoginPage.email = email;
	}
	public static WebElement getPassword() {
		return password;
	}
	public static void setPassword(WebElement password) {
		LoginPage.password = password;
	}
	public static WebElement getLoginBtn() {
		return loginBtn;
	}
	public static void setLoginBtn(WebElement loginBtn) {
		LoginPage.loginBtn = loginBtn;
	}
	@FindBy(xpath = "//*[contains(text(),'Login')]")
	public static WebElement login;
	@FindBy( xpath = "email-box")
	public static WebElement email;
	@FindBy(id="password-box")
	public static WebElement password;
	@FindBy(xpath ="//*[contains(text(),'Login')]")
	public static WebElement loginBtn;
	
	
	

	//One or more fields required
}
