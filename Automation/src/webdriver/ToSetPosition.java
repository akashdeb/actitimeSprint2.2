package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);           
		Point newPos = new Point(100, 100);
		driver.manage().window().setPosition(newPos);

	}

}
