package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		Dimension usernameDimension = usernameTextField.getSize();
		Dimension passwordDimension = passwordTextField.getSize();
		
		int usernameHeight = usernameDimension.getHeight();
		int usernameWidth=usernameDimension.getWidth();
		
		System.out.println("The width of username text field is : "+usernameWidth);
		System.out.println("The height of username text field is : "+usernameHeight);
		
		int passwordHeight = passwordDimension.getHeight();
		int passwordWidth=passwordDimension.getWidth();

		System.out.println("The width of password text field is : "+passwordWidth);
		System.out.println("The height of password text field is : "+passwordHeight);
		
		if(usernameHeight == passwordHeight && usernameWidth == passwordWidth) {
			System.out.println("Pass : the dimensions has been verified");
		}
		
		else
			System.out.println("Fail: the dimension has not been verified");
		
		driver.quit();
		
	}

}
