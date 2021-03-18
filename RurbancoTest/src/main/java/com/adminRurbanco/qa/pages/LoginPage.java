package com.adminRurbanco.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminRurbanco.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	@FindBy(name = "UserName")
	WebElement username;
	@FindBy(name= "Password")
	WebElement password;
	@FindBy(xpath = "//*[@id=\"login-form\"]/form[1]/div[3]/div[1]/button")
	WebElement LoginBtn;
	@FindBy(xpath = "//*[@id=\"myHeader\"]/div/div[1]/a/img")
	WebElement Logo;
	// Initializing page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// 	Actions
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	public boolean validateCRMImage() {
		return Logo.isDisplayed();
	}
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage();
	}
}

 