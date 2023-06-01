package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentIssues {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get("file:///C:/Users/AkashDeb/Desktop/Automation.html");
		
		Point usernameLocation = driver.findElement(By.id("123")).getLocation();
		Point passwordLocation = driver.findElement(By.name("Sanjit")).getLocation();
		
		System.out.println(usernameLocation);
		System.out.println(passwordLocation);
		
		int usernameXCoordinate = usernameLocation.getX();
		int passwordXCoordinate = passwordLocation.getX();
		
		if(usernameXCoordinate==passwordXCoordinate) {
			System.out.println("Pass: The alliignment is proper");
		}
		else
			System.out.println("Fail: the allignment is not proper ");
		
		driver.quit();
	}

}
