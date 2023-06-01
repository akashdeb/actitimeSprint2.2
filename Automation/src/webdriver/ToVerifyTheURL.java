package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheURL {

	public static void main(String[] args) {
		//launching the empty chrome browser
		ChromeDriver driver = new ChromeDriver();
		//navigating to the selenium.dev
		driver.get("https://www.selenium.dev/");
		//fetching the url
		String url = driver.getCurrentUrl();
		//printing the url on the console
		System.out.println(url);
		//verifying whether the url is proper or not
		if(url.contains("selenium")) {
			System.out.println("Pass: the url is verified");
		}
		
		else
			System.out.println("Fail: the url is not verified");
		
		driver.quit();
	}

}
