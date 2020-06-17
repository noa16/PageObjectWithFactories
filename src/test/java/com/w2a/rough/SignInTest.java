package com.w2a.rough;

import org.testng.annotations.Test;

import com.w2a.basic.Page;
import com.w2a.pages.actions.HomePage;
import com.w2a.pages.actions.SigninPage;

public class SignInTest {

	@Test
	public void signInTest() {
		
		

        Page.initConfiguration();
		SigninPage signin = Page.topNav.gotoSignIn();
		signin.doLogin("acbc@gmail.com", "1234");
		Page.quitBrowser();
	}
	
}
