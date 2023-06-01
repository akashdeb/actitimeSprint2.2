package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubmit {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).submit();	
	}

}
