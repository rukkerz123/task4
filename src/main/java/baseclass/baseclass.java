package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass { 
	public  static WebDriver driver;
	public static void launchbrowser() {
		WebDriverManager .chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void launchurl(String text) {
		driver.get(text);
	} 
	public static void mobilenumber(WebElement element ,String text) {
		element.sendKeys(text);
	} 
	public static void Emailaddress (WebElement element , String text) {
		element.sendKeys(text);
	} 
	public static void  click (WebElement element) {
		element.click();
	}
	public static void occupation(WebElement element , int num) {
		Select select  = new Select(element);
		select.selectByIndex(num);
	} 
	public static void datepicker(WebElement element, String text) {
		element.sendKeys(text);;
	}
	public static void username(WebElement element , String text) {
		element.sendKeys(text);
	} 
	public static void password(WebElement element , String text) {
		element.sendKeys(text);
	}
	public static void securityquestion(WebElement element , int num2) {
		Select select  = new Select(element);
		select.selectByIndex(num2);
		
	}
			
		public static  void securityanswer(WebElement element , String text) {
			element.sendKeys(text);
			
		}
		public static void firstname(WebElement element , String text) {
			element.sendKeys(text);
		}
		public static void lastname(WebElement element ,String text) {
			element.sendKeys(text);
		}
		public static void preferredlanguage(WebElement element , int num1) {
			Select sel = new Select(element);
					sel.selectByIndex(num1);
		}
		public static void residentialaddress (WebElement element , String text) {
			element.sendKeys(text);
		}
		public static void countryresidence(WebElement element , int num3) {
			Select select = new Select(element);
			select.selectByIndex(num3);
			
		}
		public static void pincode(WebElement element, String text2) {
			element.sendKeys(text2);
		} 
	
		
	}

	
	


