package crossBrowser;

import org.openqa.selenium.WebDriver;

public class CrossBrowserTesting {
	
	public static void test(WebDriver driver) {
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		
		if(title.contains("Google")) {
			System.out.println("Pass: the title is verified");
		}
		
		else
			System.out.println("Fail: the title is not verified");
		
		driver.quit();
	}

}
