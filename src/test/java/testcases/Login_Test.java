package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pageobjects.Login_Page;
import base.BaseClass;

public class Login_Test extends BaseClass{
	@Test
	public void login() {
		
		Login_Page lp = new Login_Page(driver);

		lp.login();
		lp.user_name();
		lp.password();
		lp.login_btn();
		
		
	}
	
	
	
	

}
