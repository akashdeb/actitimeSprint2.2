package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fineuploader.com/demos.html");
		
		driver.findElement(By.xpath("//input[@title=\"file input\"]")).sendKeys("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium1PMBatchApril\\Automation\\testData\\photo.png");
	}

}
