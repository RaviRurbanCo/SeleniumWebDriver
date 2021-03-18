package TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generate_Token {

	public static void main(String[] args) {
		// Lanuch Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\NewEclipse\\chromedriver\\chromedriver.exe ");
		WebDriver driver =  new ChromeDriver();// Launch Chrome
		driver.get("https://rurbanco.com");// Launch URL
		driver.manage().window().maximize();// Maximize Window
		driver.manage().deleteAllCookies();// Delete Cookies
		//Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5 ,TimeUnit.SECONDS);
		// Validate Correct Title
		String title = driver.getTitle();
		System.out.println(title);// Get Title
		if (title.equals("Home | Rurbanco")) {
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("incorrect Title");
		}
		// Login 
		/*
		 * driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("Rurbanco");
		 * driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("RurBanC0");
		 * driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		 */
		// Find Link
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
	
		System.out.println("The number of links is" + linkslist.size());
		
		

	}

}
