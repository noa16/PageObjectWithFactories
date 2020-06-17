package com.w2a.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.basic.Page;
import com.w2a.pages.locators.TopNavigationLocators;



//HotelPage HAS A TopNavigation

public class TopNavigation {//common to all web pages

	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver) {
		
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);//implicit wait 10 seconds
		PageFactory.initElements(factory, this.topNavigation);
	
	}
	
	public SigninPage gotoSignIn() {
		
		Page.click(topNavigation.account);
		Page.click(topNavigation.signinBtn);
		
		return new SigninPage();//after clicking on sign in we navigate to a new page =>(sign in )
		
	}
	
	
	public void gotocreateAccount() {
		
	}
	
	
	public void gotoSupport() {
		
	}
	
	public void gotoHome() {
		
	}
	
	public void gotoFlight() {
		
	}
}
