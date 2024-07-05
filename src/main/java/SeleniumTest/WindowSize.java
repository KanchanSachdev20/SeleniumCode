package SeleniumTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Dimension dim = new Dimension(500,800);
		
		driver.manage().window().setSize(dim);
		driver.get("https://www.google.com");
		
		driver.quit();

	}

}
