package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToVerifyGoogleInChromeAndEdge {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void toVerifyGoogle(String browser) {
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		if(driver.getTitle().equals("Google")) {
			System.out.println("Pass: the title is verified");
		}
		else
			System.out.println("Fail: the title is not verified");
	}

}
