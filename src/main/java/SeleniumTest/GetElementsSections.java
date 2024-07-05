package SeleniumTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsSections {

	static WebDriver driver;
	public static void main(String[] args) {
		
	   driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> rightPanelList = driver.findElements(By.cssSelector("a.list-group-item"));
		System.out.println(rightPanelList.size());
		
		for(WebElement e:rightPanelList) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinkList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		
		for(WebElement e:elementsLinkList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
