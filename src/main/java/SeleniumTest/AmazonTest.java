package SeleniumTest;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		br.initDriver("chrome");
		br.launchURL("https://www.amazon.com");
		
		String actual = br.getPageTitle();
		Verify.equalValues(actual, "Amazon.com. Spend less. Smile more");
		
		String actURL = br.getPageURL();
		Verify.containValues(actURL, "amazon");
		
		br.quitBrowser();
	}

}
