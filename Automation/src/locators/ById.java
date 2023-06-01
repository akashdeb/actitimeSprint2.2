package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) {
		//Launch 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("file:///C:/Users/AkashDeb/Desktop/Automation.html");
		
		//Identifying username textfield
		WebElement usernameTextfield = driver.findElement(By.id("123"));
		
		//passing the value in username textfield		
		usernameTextfield.sendKeys("Baba Ramdev");
		
		//Identifying password textfield
		WebElement passwordTextField = driver.findElement(By.name("Sanjit"));
		
		//passing the value in password textfield		
		passwordTextField.sendKeys("Kuch bhi");
	}

}
