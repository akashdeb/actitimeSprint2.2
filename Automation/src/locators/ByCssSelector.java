package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("file:///C:/Users/AkashDeb/Desktop/Automation.html");

		WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkboxy']"));
		checkbox.click();
		Thread.sleep(2000);
		checkbox.click();
	}

}
