package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsException {

	static ChromeDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//findElement ---> noSuchElementException
		
		//findElements ---return empty list in case no element found , not throw any exception
		
		List<WebElement> rightPanelList = driver.findElements(By.cssSelector("a.list-group-item11"));
		System.out.println(rightPanelList.size());
		
	}

	
	public static boolean checkElementIsDisplayed(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		if(eleList.size()>0) {
			System.out.println("element is present on page");
			return true;
		}
		else {
			return false;
		}
		
	}
}
