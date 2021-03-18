package RurbanCoTestAutomation.RurbancoTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adminRurbanco.qa.base.TestBase;
import com.adminRurbanco.qa.pages.HomePage;
import com.adminRurbanco.qa.pages.LoginPage;

public class UIHomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	
	
	public UIHomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homepage =loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@id=\"myHeader\"]/div/div[1]/a/img")).click();
	}
	@Test
	public void verifyHomePageTitle() {
		String homepageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Home | Rurbanco", "Home page title not matched");
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
