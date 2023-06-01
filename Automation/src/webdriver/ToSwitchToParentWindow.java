package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate
		driver.get("https://demo.actitime.com/login.do");
		
		//Fetching the id of the parent browser
		String parentId = driver.getWindowHandle();
		
		//Clicking on the link
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		//Fetching all window ids(both parent and child)
		Set<String> allIds = driver.getWindowHandles();
		
		//Iterating through the collection
		for(String id:allIds) {
			//switching the driver control
			driver.switchTo().window(id);
			//Checking if it is not parent id
			if(!id.equals(parentId)) {
				//Fetching the title of the child
				String titleOfChild = driver.getTitle();
				Thread.sleep(5000);
				//Printing the title of the child on the console
				System.out.println(titleOfChild);
			}
		}
		//switching back the control to the parent
		driver.switchTo().window(parentId);
		//Fetching the title of the parent
		String titleOfParent = driver.getTitle();
		//Printing the title of the parent on the console
		System.out.println(titleOfParent);

	}

}
