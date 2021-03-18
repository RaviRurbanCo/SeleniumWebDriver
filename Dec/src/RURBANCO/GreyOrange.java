package RURBANCO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GreyOrange {
 static WebDriver driver;
	public static void main(String[] args) {
		// Launch Chrome
		System.setProperty("webdriver.chrome.driver","C:\\NewEclipse\\chromedriver\\chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		// Lanuch Incognito
		options.addArguments("incognito");
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		//Instantiate a ChromeDriver Class
		driver = new ChromeDriver(cap);
		driver.manage().window(). maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("http://gcm-test.greymatter.greyorange.com/");
		driver.findElement(By.xpath("//input[@type='text' and @class= 'form-control']")).sendKeys("naman.g");
		driver.findElement(By.xpath("//input[@type='password' and @class= 'form-control']")).sendKeys("qwerty@123");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('login-confirm-button').click()");
		driver.findElement(By.xpath("//div[@class='clients-selection-row bg-test']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[1]/div[2]/ul/li[2]/div")).click();
	}

}
