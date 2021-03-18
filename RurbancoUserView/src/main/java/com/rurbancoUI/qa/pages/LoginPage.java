package com.rurbancoUI.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rurbancoUI.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	@FindBy(name="UserName")
	WebElement username;

	@FindBy(name="Password")
	WebElement password; 
	
	@FindBy(xpath="//*[@id=\"login-form\"]/form[1]/div[3]/div[1]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"myHeader\"]/div/div[1]/a/img")
	WebElement RurLogo;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	//Action:
	public boolean validateImage() {
		return RurLogo.isDisplayed();
	}
	public void login(String un, String Pwd) {
		username.sendKeys(un);
	}
	
	

}
