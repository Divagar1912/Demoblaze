package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Utility;

public class Login_Page extends Utility  {
public WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(id = "login2")
	WebElement login;
	
	@FindBy(id = "loginusername")
	WebElement username;
	
	@FindBy(id = "loginpassword")
	WebElement pswrd;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[3]")
	WebElement loginbtn;
	
	
	public void login() {
		login.click();
	}
	
	public void user_name() {
		username.click();
		username.sendKeys("Divagar");
	}
	
	public void password() {
		pswrd.click();
		pswrd.sendKeys("1234");
	}
	
	public void login_btn() {
		loginbtn.click();
	}
	
}
