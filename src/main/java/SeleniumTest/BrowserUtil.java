package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;

	
	public WebDriver initDriver(String browserName) {
		
		if(browserName == null) {
			System.out.println("Browser can not be null");
			throw new MySeleniumException("BrowserNullException");
		}
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please enter correct browser" + browserName);
			throw new MySeleniumException("WrongBrowserException");
		}
		return driver;
	}

	
	public void launchURL(String URL) {
		if(URL == null) {
			System.out.println("URL can not be null");
			throw new MySeleniumException("URLNULLXCEPTION");
		}
		
		if(URL.contains("http")) {
			driver.get(URL);
		}
		else {
			System.out.println("http(s) is missing");
		}
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
}
