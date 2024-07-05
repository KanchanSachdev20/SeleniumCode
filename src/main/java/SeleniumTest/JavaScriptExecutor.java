package SeleniumTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);

	}

}
