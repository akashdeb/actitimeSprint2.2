package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		
		for(String id:allIDs) {
			driver.switchTo().window(id);
			if(!id.equals(parentId)) {
				Thread.sleep(5000);
				driver.close();
			}
		}
		

	}

}
