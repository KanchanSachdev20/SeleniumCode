package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		System.out.println(pageSource.contains("end customer section"));
		
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());

	}

}
