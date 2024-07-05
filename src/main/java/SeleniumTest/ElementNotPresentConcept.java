package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresentConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		driver.findElement(By.name("search1")).sendKeys("Kanchan");

		//NoSuchElementException
		//ElementNotFoundException --- not in Selenium
		
		By search = By.name("search");
		getElement(search);
	}

	public static WebElement getElement(By locator)  {
		WebElement element = null;
		
		try {
			element = driver.findElement(locator);
			System.out.println("element found with locator" + locator);
		}catch (NoSuchElementException e) {
			System.out.println("Element not found"+locator);
			try {
				Thread.sleep(5000);//static wait
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}
}
