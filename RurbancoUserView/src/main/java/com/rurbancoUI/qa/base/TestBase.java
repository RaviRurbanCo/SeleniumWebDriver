package com.rurbancoUI.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.rurbancoUI.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop= new Properties();
			FileInputStream ip = new FileInputStream("C:\\NewEclipse\\RurbancoUserView\\src\\main\\java\\com\\rurbancoUI\\qa\\config\\config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setAcceptInsecureCerts(true);
			System.setProperty("webdriver.chrome.driver","C:\\NewEclipse\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\NewEclipse\\geckodriver-v0.28.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOADTIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil. IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}
}
