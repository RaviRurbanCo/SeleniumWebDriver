package RURBANCO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RURBANCO {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver","C:\\NewEclipse\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		//Instantiate a ChromeDriver Class
		driver = new ChromeDriver(cap);
		driver.manage().window(). maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://uatweb.rurbanco.com");
		driver.findElement(By.xpath("//*[@id=\"user-login\"]/a")).click();
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("RCU0000004");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("CQU0000004");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/form[1]/div[3]/div[1]/button")).click();
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//*[@id=\"myHeader\"]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//span[contains(text(),'PickUp Location/Pin Code')]")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("110025");
		driver.findElement(By.xpath("//li[contains(text(),'110025 | New Friends Colony S.O')]")).click();
		driver.findElement(By.xpath("//span[@id='select2-DeliveryLocationId-container']")).click();
		driver.findElement(By.xpath(" //body/span[1]/span[1]/span[1]/input[1]")).sendKeys("110092");
		driver.findElement(By.xpath("//li[contains(text(),'110092 | IP Extension S.O')]")).click();
		driver.findElement(By.xpath("//select[@id='DocType']")).sendKeys("LETTER");
		driver.findElement(By.xpath("//*[@id=\"WeightKG\"]")).sendKeys("2");
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn hoverable waves-effect waves-light btn-secondary']")).click();
		//driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/div/div/div[2]/div/div/form[1]/div/div[1]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/div/div/div[2]/div/div/form[1]/div/div[5]/button")).click(); 
		
		//Thread.sleep(1000); driver.switchTo().alert();
		  //driver.findElement(By.xpath(
		  //"//body/div[@id='priceBreakUp']/div[1]/div[1]/div[1]/div[1]/button[1]")).
		  //click(); //driver.find
		 Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath(" //*[@id=\"btn-proceed-payment\"]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		js.executeScript("document.getElementById('terms-and-conditions').click()");
		js.executeScript("document.getElementById('btn-proceed-payment').click()");
		// Handle PGW 
		driver.switchTo().frame(0);
		// To close PWG page
		/*
		 * WebElement email_id=
		 * driver.findElement(By.xpath("//*[@id=\"modal-close\"]")); email_id.click();
		 */
		// FROM QR Code
		 driver.findElement(By.xpath("//*[@id=\"form-common\"]/div[1]/div/div/div[2]/div/div/button[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"showQr\"]/div")).click();
		 
		// From Card
		/*
		driver.findElement(By.xpath("//*[@id=\"form-common\"]/div[1]/div/div/div[2]/div[2]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"card_number\"]")).sendKeys("4111 1111 1111 1111");
		driver.findElement(By.xpath("//*[@id=\"card_expiry\"]")).sendKeys("11/23");
		driver.findElement(By.xpath("//*[@id=\"card_name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"card_name\"]")).sendKeys("R2");
		driver.findElement(By.xpath("//*[@id=\"card_cvv\"]")).sendKeys("432");
		driver.findElement(By.xpath("//*[@id=\"footer-cta\"]")).click();
		*/
        //driver.findElement(By.name("btnLogin")).click();
		//driver.findElement(By.xpath("//*[@id=\"form-common\"]/div[1]/div/div/div[2]/div/div/button[2]")).click();	
	}
}
