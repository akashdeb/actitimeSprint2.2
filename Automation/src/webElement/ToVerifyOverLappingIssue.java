package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverLappingIssue {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get("file:///C:/Users/AkashDeb/Desktop/Automation.html");
		
		
		Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		Rectangle passwordRect = driver.findElement(By.name("Sanjit")).getRect();
		
		int usernameYCoordinate = usernameRect.getY();
		int usernameHeight = usernameRect.getHeight();
		
		int usernameEndY = usernameYCoordinate + usernameHeight;
		int passwordStartY = passwordRect.getY();
		
		int space = passwordStartY - usernameEndY;
		System.out.println("The space is : "+space);
		
		if(passwordStartY>=usernameEndY) {
			System.out.println("Pass: the there is no overlapping");
		}
		
		else
			System.out.println("Fail: the there is overlapping");

	}
	

}
