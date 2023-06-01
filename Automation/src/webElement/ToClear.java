package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get("file:///C:/Users/AkashDeb/Desktop/Xpath.html");
		
		WebElement zTextField = driver.findElement(By.xpath("//input[@value='Z']"));
		
		zTextField.clear();
		zTextField.sendKeys("Chor do");
	}

}
