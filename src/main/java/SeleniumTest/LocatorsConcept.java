package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//1: Id : unique attribute
		
		//2: name : not unique attribute
//		driver.findElement(By.name("firstname")).sendKeys("Kanchan");
//		driver.findElement(By.name("lastname")).sendKeys("Sachdev");
//		driver.findElement(By.name("agree")).click();
//		
//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		By check = By.name("agree");
//		
//		ElementUtil ele = new ElementUtil(driver);
//		ele.doSendKeys(fn, "Kanchan");
//		ele.doSendKeys(ln, "Sachdev");
//		ele.doClick(check);
		
		//3: class name : not unique attribute
		//driver.findElement(By.className("form-control")).sendKeys("Kanchan");
	
	    //4: xpath: its not an attribute : it's address of element in html dom
	    //can be unique/can be duplicate
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Kanchan");
//	    driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Sachdev");
//	
//	
	    //5: CSS selector:its not an attribute :
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Kanchan");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Sachdev");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
//	
	
		//xpath vs css??
		//Cascading style sheet
		
		//6:linkText: only for links
		//can be duplicate
		//can be blank
//		driver.findElement(By.linkText("Login")).click();	
		
		//7: partialLinkText : only for links
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8:tagName :html tag
		driver.findElement(By.linkText("Login")).click();	
		String text = driver.findElement(By.tagName("h2")).getText();
	     System.out.println(text);
	     if(text.equals("New Customer")) {
	    	 System.out.println("PASS");
	     }
	
	
	
	}

}
