package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabled {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get(
				"https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		
		emailTextBox.sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
		
		boolean enabled = button.isEnabled();
		
		if(enabled) {
			button.click();
			System.out.println("The button has been enabled");
		}
		
		else
			System.out.println("The button has not been enabled");
		
		

	}

}
