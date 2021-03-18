package RURBANCO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handle_Alert {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver","C:\\NewEclipse\\chromedriver\\chromedriver.exe");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setAcceptInsecureCerts(true);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("incognito");
	cap.setCapability(ChromeOptions.CAPABILITY, options);
	driver = new ChromeDriver(cap);
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.navigate().to("http://uatweb.rurbanco.com");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.findElement(By.xpath("//span[contains(text(),'PickUp Location/Pin Code')]")).click();
	driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("110025");
	driver.findElement(By.xpath("//li[contains(text(),'110025 | New Friends Colony S.O')]")).click();
	driver.findElement(By.xpath("//span[@id='select2-DeliveryLocationId-container']")).click();
	driver.findElement(By.xpath(" //body/span[1]/span[1]/span[1]/input[1]")).sendKeys("110092");
	driver.findElement(By.xpath("//li[contains(text(),'110092 | IP Extension S.O')]")).click();
	driver.findElement(By.xpath("//select[@id='DocType']")).sendKeys("LETTER");
	driver.findElement(By.xpath("//*[@id=\"WeightKG\"]")).sendKeys("2");
	driver.findElement(By.xpath("//button[@type='submit' and @class='btn hoverable waves-effect waves-light btn-secondary']")).click();
	// Generic Xpath
	driver.findElement(By.xpath("//b[text()='TrackOn Normal']//parent::div[@class='tittle']//preceding-sibling::div[@class='booking-price']//span[@data-toggle='modal']")).click();
	// Handle Pup up window
	String myWindowHandle = driver.getWindowHandle();
	driver.switchTo().window(myWindowHandle);
	WebElement email_id= driver.findElement(By.xpath("//div[@class='address-contant']//parent::div[@class='getqute-modal']//preceding-sibling::div[@class='modal-headings']//span[text()='×']"));
	email_id.click();
	//driver.findElement(By.xpath("//body/div[@id='priceBreakUp']/div[1]/div[1]/div[1]/div[1]/button[1]/span[1")).click();
	
	}
	 

	

	}


