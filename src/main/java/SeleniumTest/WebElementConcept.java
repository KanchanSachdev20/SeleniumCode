package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		//create a webelement + perform action (click, sendKeys, getText, isDisplayed ...)
				//findElement()       + click(), sendKeys();
		
		//1st:
//		driver.findElement(By.id("input-email")).sendKeys("kanchansachdev@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("kanchan@123");
		
		//2nd:
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
		
//		email.sendKeys("kanchansachdev@gmail.com");
//		pwd.sendKeys("kanchan@123");
		
		//3rd:
//		By email =By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailID = driver.findElement(email);
//		WebElement pass = driver.findElement(pwd);
//		
//		emailID.sendKeys("kanchansachdev@gmail.com");
//		pass.sendKeys("kanchan@123");
//		
		//4th:
//		By email =By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailID = getElement(email);
//		WebElement pass = getElement(pwd);
//		
//		emailID.sendKeys("kanchansachdev@gmail.com");
//		pass.sendKeys("kanchan@123");
		
		//5th:
//		By email =By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(email,"kanchansachdev@gmail.com");
//		doSendKeys(pwd,"Kanchan@123");
		
		//6th:
		By email =By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(email, "kanchansachdev@gmail.com");
		ele.doSendKeys(pwd,"Kanchan@123");
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
