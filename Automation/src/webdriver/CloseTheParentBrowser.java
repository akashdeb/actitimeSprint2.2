package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheParentBrowser {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Navigate to the url
		driver.get("https://demo.actitime.com/login.do");
		
		//click on the link(no need to understand)
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		//waiting for the browser
		Thread.sleep(5000);
		
		//close the parent browser
		driver.close();
	}

}
