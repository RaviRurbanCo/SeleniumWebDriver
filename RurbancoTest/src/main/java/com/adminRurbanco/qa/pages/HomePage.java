package com.adminRurbanco.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminRurbanco.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory 
	@FindBy(xpath = "//*[@id=\"user-login\"]/a/text()")
	WebElement userNameLabel;
	@FindBy(xpath = "//*[@id=\"topNavbarMain\"]/ul/li[1]/a")
	WebElement WhyRurbancolink;
	@FindBy(xpath = "//*[@id=\"topNavbarMain\"]/ul/li[2]/a")
	WebElement TrackShipmentlink;
	@FindBy(xpath = "//*[@id=\"topNavbarMain\"]/ul/li[3]/a")
	WebElement Contactuslink;
	//Initialization
	public HomePage() {
	PageFactory.initElements(driver, this);
	}
	public String verifyHomePagetitle() {
		return driver.getTitle();
	}
	public WhyRurbancopage clickOnwhyrurbancolink() {
		WhyRurbancolink.click();
		return new WhyRurbancopage();
	}
	public TrackShipmentPage clickOnTrackShipmentlink() {
		TrackShipmentlink.click();
		return new TrackShipmentPage();
	}
	public ContactUsPage clickOnContactuslink() {
		Contactuslink.click();
		return new ContactUsPage();
	}

}
