package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


		WebElement element = driver.findElement(By.id("input-email"));
		element.sendKeys("Kanchan@gmail.com");
		String text =element.getAttribute("value");
		System.out.println(text);
	
	
	}

}
