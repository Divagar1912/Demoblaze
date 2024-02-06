package Pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Utility;

public class Signup_Page extends Utility {

	public WebDriver driver;
	
	public Signup_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(id = "signin2")
	WebElement signup;
	
	@FindBy(id = "sign-username")
	WebElement name1;
	
	@FindBy(id = "sign-password")
	WebElement pswrd1;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[2]")
	WebElement signupbtn;
	
	public void signup() {
		signup.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public void entername1() {
		name1.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		name1.sendKeys("Divagar");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	}
	
	public void enterpswrd1() {
		pswrd1.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		pswrd1.sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	}
	public void signup_btn() {
		signupbtn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	
	
}
