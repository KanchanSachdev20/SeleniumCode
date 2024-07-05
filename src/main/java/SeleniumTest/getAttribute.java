package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String attr = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(attr);
//		
//		String attr1 = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		System.out.println(attr1);
//		
//		String logUrl= driver.findElement(By.linkText("Login")).getAttribute("href");
//		System.out.println(logUrl);
//	
		By loginLink = By.linkText("Login");
		String url = doGetAttribute(loginLink,"href");
		System.out.println(url);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttribute(By locator, String attribute) {
		return getElement(locator).getAttribute(attribute);
	}
}
