package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Select class
		By country = By.id("Form_getForm_Country");
		WebElement countryEle = driver.findElement(country);
		Select select = new Select(countryEle);
		//select.selectByIndex(5);
		
		//select.selectByVisibleText("Belgium");
		select.selectByValue("Aruba");
	}

}
