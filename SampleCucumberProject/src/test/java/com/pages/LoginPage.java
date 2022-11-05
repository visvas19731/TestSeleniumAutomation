package com.pages;

import commonMethods.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass {
	@Given ("Enter the username as (.*)")
	public LoginPage enterusername(String username) {
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(username);
		return this;
		
	}
	@Given ("Enter the Password as (.*)")
	public LoginPage enterpassword(String password) {
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(password);
		return this;
		
	}
	@When ("Click on Login")
	public AdminPage clickbtn() {
		driver.findElementByXPath("//button[@type='submit']").click();
	return new AdminPage();
	}
}
