package SeleniumTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doClear(By locator) {
		getElement(locator).clear();
	}

	public void doSendKeys(By locator, String value) {
		if (value == null) {
			System.out.println("null values not allowed");
			throw new MySeleniumException("ValueCannotBeNull");
		}
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	public WebElement getElement(By locator) {
		WebElement element = null;

		try {
			element = driver.findElement(locator);
			System.out.println("element found with locator" + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element not found" + locator);
			try {
				Thread.sleep(5000);// static wait
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

   public  String doGetAttribute(By locator, String attribute) {
		return getElement(locator).getAttribute(attribute);
	}
   
   public  int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public  List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> list = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for(WebElement e:list) {
			String attrValue = e.getAttribute(attrName);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}

	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public  List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinkList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e:elementsLinkList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	public void clickElementFromPageSection(By locator,String eleText) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e:eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(eleText)) {
				e.click();
				break;
			}
		}
	}
	
	public void search(String searchKey, By locator, String suggName,By suggestions) {
		doSendKeys(locator, searchKey);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> suggList = getElements(suggestions);
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
	
	public  boolean checkElementIsDisplayed(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		if(eleList.size()>0) {
			System.out.println("element is present on page");
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//***************************************Drop Down List ****************************************
	
	
	
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void doSelectDropDownByValueAttribute(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public int getDropDownValueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}
	
	public List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("total values" + optionsList.size());
		
		for(WebElement e:optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}
	
	public boolean doSelectDropDownValue(By locator,String dropDownValue) {
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values" + optionsList.size());
		
		for(WebElement e:optionsList) {
			String text = e.getText();
			if(text.equals(dropDownValue)) {
				flag = true;
				e.click();
				break;
			}
			
		}
		if(flag==false) {
			System.out.println(dropDownValue +"not present");
		}
		return flag;
	}
	
	public  boolean doSelectValueFromDropDownWithoutSelectClass(By locator, String value) {
		boolean flag=false;
		List<WebElement> optionsList = getElements(locator);
		for(WebElement e: optionsList) {
			String text = e.getText();		
			if(text.equals(value)) {
				flag = true;
				e.click();
				break;
			}
			
		}
		
		if(flag ==false) {
			System.out.println(value+"is not present in drop down" + locator);
		}
		return flag;
	}

	public void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public Alert waitForAlertJsPopUp(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public  String alertJSGetText(int timeOut) {
		return waitForAlertJsPopUp(timeOut).getText();
	}
	
	public  void alertAccpet(int timeOut) {
		 waitForAlertJsPopUp(timeOut).accept();
	}
	
	public  void alertDismiss(int timeOut) {
		 waitForAlertJsPopUp(timeOut).dismiss();
	}
	
	public  void EnterAlertValue(int timeOut, String value) {
		 waitForAlertJsPopUp(timeOut).sendKeys(value);
	}

	public String waitForTitleIsAndCapture(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("title is not present within the given timeout : " + timeOut);
			return null;
		}
	}

	public String waitForFullTitleAndCapture(String titleVal, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleIs(titleVal))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("title is not present within the given timeout : " + timeOut);
			return null;
		}
	}
	
	public  String waitForURLContainsAndCapture(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present within the given timeout : " + timeOut);
			return null;
		}
	}

	public  String waitForURLAndCapture(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present within the given timeout : " + timeOut);
			return null;
		}
	}

}
