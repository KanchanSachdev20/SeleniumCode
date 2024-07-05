package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	
	public static void search(String searchKey, By locator, String suggName,By suggestions) {
		driver.findElement(locator).sendKeys(searchKey);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> suggList = driver.findElements(suggestions);
		System.out.println(suggList.size());
		
		if(suggList.size() > 0) {
		
		for(WebElement e:suggList) {
			String text = e.getText();
			if(text.length()>0) {
			System.out.println(text);
			if(text.contains(suggName)) {
				e.click();
				break;
			}
		}
			else {
				System.out.println("blank values -- no suggestions");
				break;
			}
			}
		}
		else
			System.out.println("no search suggestion found");
	}
	
	
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
		 By search = By.name("q");
		 By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		 search("Selenium",search,"selenium webdriver",suggestions);
	}

}
