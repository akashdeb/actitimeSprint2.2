package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Navigate to the URL
		driver.get("file:///C:/Users/AkashDeb/Desktop/Automation.html");
		//Locating the link
		WebElement link = driver.findElement(By.partialLinkText("Goto Selenium 2024"));
		//Clicking on the link
		link.click();
	}

}
