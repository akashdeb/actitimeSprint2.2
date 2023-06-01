package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args) {
		//launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to the URL 
		driver.get("https://www.facebook.com/");
		
		//Clicking create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//Identifying the day dropdown
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select select = new Select(dayDropdown);
		//selecting the index 9 i.e. 10 from the dropdown
		select.selectByIndex(9);
		
		//identifying the month dropdown
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select select1 = new Select(monthDropdown);
		//Selecting october from the dropdown
		select1.selectByVisibleText("Oct");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select select2 = new Select(yearDropdown);
		select2.selectByValue("1998");
		
	}

}
