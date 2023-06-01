package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementByAxis {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://amp.dev/documentation/examples/websites/interactivity-dynamic-content/star_rating/?redirected");
		
		WebElement rating1 = driver.findElement(By.id("rating1"));
		
		Actions action=new Actions(driver);
		action.moveToElement(rating1, 100, 0).perform();
	}

}
