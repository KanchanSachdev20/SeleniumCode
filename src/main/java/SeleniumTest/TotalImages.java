package SeleniumTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
//		List<WebElement> imgList = driver.findElements(By.tagName("img"));
//		System.out.println("total images on page" + imgList.size());
//		
//		for(WebElement e:imgList) {
//			String altValue = e.getAttribute("alt");
//			System.out.println(altValue);
//		}

		By image = By.tagName("img");
		By links = By.tagName("a");
		
		List<String> imgAttrList = getElementsAttributeValue(image, "alt");
		getElementsAttributeValue(links, "href");
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> list = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for(WebElement e:list) {
			String attrValue = e.getAttribute(attrName);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
