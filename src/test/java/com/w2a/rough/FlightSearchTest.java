package com.w2a.rough;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.basic.Page;
import com.w2a.pages.actions.HomePage;

import errorcollectors.ErrorCollector;

public class FlightSearchTest {
	
    @BeforeTest
     public void setUp() {
    	Page.initConfiguration();
    }
	
	    
	
	@Test
		public  void flightSearchTest() {
			
			

           
			HomePage home = new HomePage();
			//Assert.assertEquals(home.findTabCount(), 7);
		//	ErrorCollector.verifyEquals(home.findTabCount(),4);
			home.gotoFlights().bookAFLIGHT("Delhi (DEL-Indira Gandhi Intl.", "Seattle, WA (SEA-All Airports)", "06/16/2020", "08/12/2020", "2", "2");
		    
		}
		
	
		
	@AfterTest
	public void tearDown() {
		Page.quitBrowser();
		
	}

}
