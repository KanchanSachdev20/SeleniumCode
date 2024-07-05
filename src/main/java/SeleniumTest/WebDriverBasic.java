package SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Myntra"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}

		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
