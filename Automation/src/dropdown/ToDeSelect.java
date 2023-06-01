package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeSelect {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to the URL
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carDropdown = driver.findElement(By.id("cars"));
		Select select=new Select(carDropdown);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);

//		select.deselectByIndex(3);
//		Thread.sleep(2000);
//		select.deselectByVisibleText("Saab");
//		Thread.sleep(2000);
//		select.deselectByValue("volvo");
		
		select.deselectAll();

		


		
	}

}
