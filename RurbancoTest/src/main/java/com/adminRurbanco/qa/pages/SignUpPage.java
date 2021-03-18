package com.adminRurbanco.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.adminRurbanco.qa.base.TestBase;
	public class SignUpPage extends TestBase{
	
	//Page Factory
		@FindBy(name = "FullName")
		WebElement fullname;
		@FindBy(name= "EmailID")
		WebElement emailid;
		@FindBy(name = "Mobile")
		WebElement mobile;
		@FindBy(name = "Password")
		WebElement password;
		@FindBy(name = "ConfirmPassword")
		WebElement ConfirmPassword;
		@FindBy(xpath = "/html/body/div[12]/div/div/div[1]/form/div[5]/label")
		WebElement checkbox;
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

}
