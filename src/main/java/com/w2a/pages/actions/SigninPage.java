package com.w2a.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.basic.Page;
import com.w2a.pages.locators.HomePageLocators;
import com.w2a.pages.locators.SigninPageLocators;

public class SigninPage extends Page {
	

	public SigninPageLocators signinPage;
	public SigninPage() {
		
		this.signinPage = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);//implicit wait 10 seconds
		PageFactory.initElements(factory, this.signinPage);
	
	
}
	
	

public void doLogin(String username,String password) {
		
	signinPage.email.sendKeys(username);
	signinPage.password.sendKeys(password);
	click(signinPage.submit);
	
	
	}

}
