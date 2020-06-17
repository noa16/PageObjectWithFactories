package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	

	@FindBy(css = "#tab-flight-tab-hp")
	public WebElement flightTab;
	
	
	//locators for flight
	
	@FindBy(css = "#flight-origin-hp-flight")
	public WebElement fromCity;
	
	@FindBy(css = "#flight-destination-hp-flight")
	public WebElement toCity;
	
	@FindBy(css = "#flight-departing-hp-flight")
	public WebElement departFlight;
	
	
	@FindBy(css = "#flight-returning-hp-flight")
	public WebElement returnFlight;
	
	@FindBy(css = "#flight-adults")
	public WebElement adultCount;
	
	
	//@FindBy(css = "#flight-children")
	//public WebElement childCount;
	
	
	@FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	public WebElement search;
	
	
	@FindBy(css = "li[role='presentation']")
	public List<WebElement> tabCount;


}
