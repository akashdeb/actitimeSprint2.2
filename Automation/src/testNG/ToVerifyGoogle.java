package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//@Test annotated class
public class ToVerifyGoogle {
	//@Test annotated method
	@Test
	public void toVerifyGoogle() {
		WebDriver driver = new ChromeDriver();
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
