package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://www.selenium.dev/");
		
		WebElement link = driver.findElement(By.xpath("//span[text()='Downloads']"));
		link.click();

	}

}
