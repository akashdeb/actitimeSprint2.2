package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagname {

	public static void main(String[] args) {
		// launching the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// navigation to the url
				driver.get("https://demo.actitime.com/login.do");
				
				WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
				
				String checkboxTagName = checkbox.getTagName();
				System.out.println(checkboxTagName);
				
				if(checkboxTagName.equals("input")) {
					checkbox.click();
				}
				
				else
					System.out.println("The tag name is not proper");
	}

}
