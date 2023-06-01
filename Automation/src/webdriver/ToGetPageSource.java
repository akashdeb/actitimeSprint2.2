package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to the url
		driver.get("https://demo.actitime.com/login.do");
		
		String pageSource = driver.getPageSource();
		
		//printing the source code of the webpage
		System.out.println(pageSource);
		
		if(pageSource.contains("actitime")) {
			System.out.println("Pass: the page contains the information");
		}
		
		else
			System.out.println("Fail: The page doesn't contains the information");
	
		driver.quit();
	}

}
