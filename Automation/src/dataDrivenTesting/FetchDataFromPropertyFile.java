package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./testData/propertyData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String urlFromPropertyFile = prop.getProperty("url");
		System.out.println(urlFromPropertyFile);
		
		String usernameFromPropertyFile = prop.getProperty("username");
		System.out.println(usernameFromPropertyFile);
		
		String passwordFromPropertyFile = prop.getProperty("password");
		System.out.println(passwordFromPropertyFile);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(urlFromPropertyFile);
		
		driver.findElement(By.id("username")).sendKeys(usernameFromPropertyFile);
		driver.findElement(By.name("pwd")).sendKeys(passwordFromPropertyFile);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
