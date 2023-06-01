package webdriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllIds {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Set<String> allIDs = driver.getWindowHandles();
		
		System.out.println(allIDs);
		
		driver.close();
	}

}
