package com.w2a.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.basic.Page;
import com.w2a.pages.locators.HomePageLocators;

public class HomePage extends Page{

	public HomePageLocators home;
	
	
	public HomePage() {
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);//implicit wait 10 seconds
		PageFactory.initElements(factory, this.home);
		
	}
	
	public HomePage gotoFlights() {
		System.out.println("go to flights func");
		click(home.flightTab); 
		return this; //because when we click on the tab we navigate to the same page 
	}
	
	
	public void gotoHotels() {
		
	}
	
	public void gotoFlightAndHotel() {
		
		
	}
	
	public void bookAFLIGHT(String from ,String to , String departing , String returning , String noOfAdults , String noOfChildren) {
		
		home.fromCity.sendKeys(from);
		home.toCity.sendKeys(to);
		home.departFlight.sendKeys(departing);
		home.returnFlight.sendKeys(returning);
		//home.adultCount.sendKeys(noOfAdults);
		//home.childCount.sendKeys(noOfChildren);
		
		click(home.search);
		
	}
	
	
	public int findTabCount() {
		
		return home.tabCount.size();
	}
	

	
}
