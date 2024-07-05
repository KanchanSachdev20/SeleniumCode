package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterForm {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("firefox");
		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = br.getPageTitle();
		System.out.println(title);
		
		By email =By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(email, "kanchansachdev@gmail.com");
		ele.doSendKeys(pwd,"Kanchan@123");
		
		br.quitBrowser();

	}

}
