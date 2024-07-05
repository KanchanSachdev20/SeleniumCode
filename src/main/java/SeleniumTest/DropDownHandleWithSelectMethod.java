package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectMethod {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		
		By week = By.id("select-demo");
		By state = By.id("multi-select");
		
		WebElement stateEle = driver.findElement(state);
		WebElement weekEle = driver.findElement(week);
		
		Select select = new Select(stateEle);
		System.out.println(select.isMultiple());
		
		Select select1 = new Select(weekEle);
		System.out.println(select1.isMultiple());
		
		select.selectByVisibleText("California");
		select.selectByVisibleText("Washington");
		
		List<WebElement> allStateSelectList = select.getAllSelectedOptions();
		for(WebElement e : allStateSelectList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		String firstOption = select.getFirstSelectedOption().getText();
		System.out.println(firstOption);
		
		select.deselectByVisibleText("California");
		select.deselectAll();

	}

}
