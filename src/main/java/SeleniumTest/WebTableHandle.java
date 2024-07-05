package SeleniumTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		selectUser("John.Smith");
		List<String> info = getUserInfo("John.Smith");
		System.out.println(info);
		

	}

	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getUserInfo(String userName) {
		List<WebElement> userInfo = driver.findElements(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/following-sibling::td"));
		List<String> userInfoList = new ArrayList<String>();
		for(WebElement e: userInfo) {
			String text = e.getText();
			userInfoList.add(text);
		}
		return userInfoList;
	}
}
