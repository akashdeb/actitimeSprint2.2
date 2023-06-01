package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToSubURL {

	public static void main(String[] args) throws MalformedURLException {
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to main/Parent URL
		driver.get("https://www.selenium.dev/");
			
		//Navigate to sub url
		URL subURL = new URL("https://www.oracle.com/in/");
		driver.navigate().to(subURL);

	}

}
