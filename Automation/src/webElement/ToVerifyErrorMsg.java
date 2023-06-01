package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		//launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//navigation to the url
		driver.get("https://demo.actitime.com/login.do");
		//clicking on the login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		//fetching the error msg
		String errorMsg = driver.findElement(By.className("errormsg")).getText();
		//verifying the error msg
		if(errorMsg.contains("Username or Password is invalid.")) {
			System.out.println("Pass: the error msg is verified");
		}
		else
			System.out.println("Fail: the error msg is not verified");
		//closing the browser
		driver.quit();

	}

}
