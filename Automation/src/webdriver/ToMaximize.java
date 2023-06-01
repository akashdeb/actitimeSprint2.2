package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximize {

	public static void main(String[] args) throws InterruptedException {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//minimize method is present only from selenium 4
		driver.manage().window().minimize();

	}

}
