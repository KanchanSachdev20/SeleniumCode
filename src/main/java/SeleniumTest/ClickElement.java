package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By email = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");

		doSendKeys(email,"kanchan@gmail.com");
		doSendKeys(pwd,"kanchan@123");
		doClick(loginBtn);	}
	
	public static void doClear(By locator) {
		getElement(locator).clear();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

}
