package RurbanCoTestAutomation.RurbancoTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.adminRurbanco.qa.base.TestBase;
import com.adminRurbanco.qa.pages.HomePage;
import com.adminRurbanco.qa.pages.LoginPage;

public class AdminLoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public AdminLoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	@Test(priority=1)
	public void LoginPageTitlePage() {
		String Title = loginPage.validateLoginpageTitle();
		Assert.assertEquals(Title,"User Login | Rurbanco");
	}
	@Test(priority=2)
	public void logo() {
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);	
	}
	@Test(priority=3)
	public void LoginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod	
	public void tearDown() {
		driver.quit();
		}		 
	}