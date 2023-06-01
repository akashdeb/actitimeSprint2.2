package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotSelectTag {
	//How to handle dropdowns or list boxes?
	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to the URL
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.className("css-1wa3eu0-placeholder"));

		dropdown.click();
		driver.findElement(By.xpath("null/DIV[1]")).click();
		
//		Actions action=new Actions(driver);
//		action.sendKeys(dropdown, "A root").sendKeys(Keys.ENTER).perform();
	}

}
