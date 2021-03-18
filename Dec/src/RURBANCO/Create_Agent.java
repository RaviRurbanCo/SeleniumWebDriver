package RURBANCO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Create_Agent {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\NewEclipse\\chromedriver\\chromedriver.exe");
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setAcceptInsecureCerts(true);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("incognito");
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				//Instantiate a ChromeDriver Class
				driver = new ChromeDriver(cap);
				driver.manage().window(). maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				/*
				 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
				 * driver.manage().deleteAllCookies();
				 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				 * driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				 */
				driver.get("http://uatadmin.rurbanco.com/");
				driver.findElement(By.xpath("//label[contains(text(),'User Name')]")).click();
				driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Rurbanco");
				driver.findElement(By.xpath("//input[@id='Password']")).click();
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("RurBanC0");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				//driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[contains(text(),'Manage Agent')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Manage Agent')]")).click();
				driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
				driver.findElement(By.xpath("//input[@id='txtname']")).click();
				driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("Jhon");
				driver.findElement(By.xpath("//input[@id='txtemail']")).click();
				driver.findElement(By.xpath("//input[@id='txtemail']")).sendKeys("raviagent12@gmail.com");
				driver.findElement(By.xpath("//input[@id='txtphone']")).click();
				driver.findElement(By.xpath("//input[@id='txtphone']")).sendKeys("6200595261");
				driver.findElement(By.xpath("//input[@id='txtcontactperson']")).click();
				driver.findElement(By.xpath("//input[@id='txtcontactperson']")).sendKeys("raviagent12@gmail.com");
				driver.findElement(By.xpath("//input[@id='txtcontactemail']")).click();
				driver.findElement(By.xpath("//input[@id='txtcontactemail']")).sendKeys("raviranjan2764@gmail.com");
				driver.findElement(By.xpath("//input[@id='txtmobile']")).click();
				driver.findElement(By.xpath("//input[@id='txtmobile']")).sendKeys("37264369853");
				driver.findElement(By.xpath("//input[@id='txtaddress1']")).click();
				driver.findElement(By.xpath("//input[@id='txtaddress1']")).sendKeys("Address1");
				driver.findElement(By.xpath("//input[@id='txtaddress2']")).click();
				driver.findElement(By.xpath("//input[@id='txtaddress2']")).sendKeys("Address2");
				driver.findElement(By.xpath("//input[@id='txtlandmark']")).click();
				driver.findElement(By.xpath("//input[@id='txtlandmark']")).sendKeys("LANDMARK");
				driver.findElement(By.xpath("//input[@id='txtgstno']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='txtgstno']")).sendKeys("EBFKJES873495");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@id='ddlCountryName']")).click();
				driver.findElement(By.xpath("//select[@id='ddlCountryName']")).sendKeys("India");
				driver.findElement(By.xpath("//option[contains(text(),'India')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@id='ddlStateName']")).click();
				//driver.findElement(By.xpath("//select[@id='ddlStateName']")).sendKeys("Delhi");
				driver.findElement(By.xpath("//*[@id=\"ddlStateName\"]/option[10]")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("ddlCityName")).click();
				//driver.findElement(By.id("ddlCityName")).sendKeys("Delhi");
				driver.findElement(By.xpath("//*[@id=\"ddlCityName\"]/option[105]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@id='ddlPincode']")).click();
				driver.findElement(By.xpath("//option[contains(text(),'110003')]")).click();
				//Handle side scroll bar
				JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement Element = driver.findElement(By.xpath("//label[contains(text(),'Validity Start Date')]"));
				js.executeScript("arguments[0].scrollIntoView();",Element);
				// Handle Calendar
				Thread.sleep(1000);
//				WebElement date = driver.findElement(By.id("txtstartdate"));
//				String dateVal = "11/11/2022";
//				selectDateByJS(driver,date,dateVal);
//	}
//				public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
//					JavascriptExecutor js = ((JavascriptExecutor)driver);
//					js.executeScript("argument[0].setAttribute('value','"+dateVal+");",element);
				
			
				js.executeScript("document.getElementById('txtstartdate').value='11/22/2022'");
				/*
				 * driver.findElement(By.xpath("//input[@id='txtstartdate']")).click(); String
				 * date = "11/Nov/2022"; String dateArr[] = date.split("/"); String day =
				 * dateArr[0]; String Month = dateArr[1]; String Year = dateArr[2]; Select
				 * select = new Select(driver.findElement(By.xpath(
				 * "//select[contains(@class,'ui-datepicker-month')]")));
				 * select.selectByVisibleText(Month); Select selects = new
				 * Select(driver.findElement(By.xpath(
				 * "//select[contains(@class,'ui-datepicker-year')]")));
				 * selects.selectByVisibleText(Year);
				 * 
				 * String beforeXpath = "/html[1]/body[1]/div[9]/table[1]/tbody[1]/tr["; String
				 * afterXpath = "]/td["; final int totalWeekDays = 7; boolean flag = false;
				 * String dayVal; for(int rowNum=1; rowNum<=7; rowNum++) { for(int colNum = 1;
				 * colNum<=totalWeekDays; colNum++) { try { dayVal =
				 * driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).
				 * getText(); }catch(NoSuchElementException e) {
				 * System.out.println("Please enter a correct date value"); flag = false; break;
				 * } System.out.println(dayVal); if(dayVal.equals(day)) {
				 * driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click(
				 * ); flag = true; break; } } if(flag) { break; } }
				 */
				driver.findElement(By.xpath("//input[@id='txtAccountholderName']")).click();
				driver.findElement(By.xpath("//input[@id='txtAccountholderName']")).sendKeys("09852340583453");
				// Handle Calendar2
				/*Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='txtenddate2']")).click();
				String datee = "12-Oct-2021";
				String dateeArr[] = datee.split("-");
				String dayy = dateeArr[0];
				String Monthh = dateeArr[1];
				String Yearr = dateeArr[2];
				
				Select select0 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
				select0.selectByVisibleText(Monthh);
				Select select1 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
				select1.selectByVisibleText(Yearr);
				
				String beforeeXpath = "/html[1]/body[1]/div[9]/table[1]/tbody[1]/tr[";
				String afterrXpath = "]/td[";
				final int totallWeekDays = 7;
				boolean flagg = false;
				for(int rowwNum=1; rowwNum<=7; rowwNum++) {
					for(int collNum = 1; collNum<=totallWeekDays; collNum++) {
						String dayyVal = driver.findElement(By.xpath(beforeeXpath+rowwNum+afterrXpath+collNum+"]")).getText();
						System.out.println(dayyVal);
						if(dayyVal.equals(dayy)) {
							driver.findElement(By.xpath(beforeeXpath+rowwNum+afterrXpath+collNum+"]")).click();
							flagg = true;
							break;
						}
					}
					if(flagg) {
						break;
					}
				}*/
			//	driver.findElement(By.xpath("//button[@id='btnSave']")).click();
				Thread.sleep(2000);
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();//for click on ok option
				//alert.dismiss();//for cancel 
			}  
	}

