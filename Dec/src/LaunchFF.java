import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\NewEclipse\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://rurbanco.com/Account/SignUp");
		 driver.findElement(By.xpath("//input[@id='FullName']")).sendKeys("Ravi");
		 driver.findElement(By.xpath("//input[@id='EmailID']")).sendKeys("raviranjan27@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"Mobile\"]")).click();
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("@32452nvnfdjv");
		 driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("@32452nvnfdjv");
		 driver.findElement(By.xpath("//input[@id='IsTermsChecked']")).click();
		 
		 
		 
	}

}
