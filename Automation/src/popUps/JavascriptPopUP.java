package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptPopUP {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to the URL
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		alert.sendKeys("Qspiders");
		alert.accept();
		System.out.println(alertMessage);
	
		driver.switchTo().frame(10);
		
		driver.findElement(By.xpath("//img[@id=\"close_button_svg\"]")).click();

	}

}
