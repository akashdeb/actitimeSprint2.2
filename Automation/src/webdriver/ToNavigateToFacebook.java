package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToFacebook {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Navigate to the URL
		driver.get("https://www.facebook.com/");

	}

}
