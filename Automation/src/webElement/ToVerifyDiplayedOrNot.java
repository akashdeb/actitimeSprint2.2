package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDiplayedOrNot {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		
		boolean displayed = emailTextBox.isDisplayed();
		
		if(displayed) {
			emailTextBox.sendKeys("ayush@gmail.com");
			System.out.println("The value has been passed");
		}
		else
			System.out.println("The text box is not displayed");

	}

}
