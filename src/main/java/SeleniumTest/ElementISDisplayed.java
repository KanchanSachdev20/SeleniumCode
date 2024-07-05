package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementISDisplayed {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		boolean flag = driver.findElement(By.name("search")).isDisplayed();
//		System.out.println(flag);
//		
		By search = By.name("search");
		ElementUtil el = new ElementUtil(driver);
		if(el.isElementDisplayed(search)) {
			el.doSendKeys(search, "kanchan");
		}
		else {
			System.out.println("search is not present");
		}

	}

}
