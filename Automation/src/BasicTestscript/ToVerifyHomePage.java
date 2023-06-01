package BasicTestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import testNG.BaseClass;

public class ToVerifyHomePage extends BaseClass {

	@Test
	public void verifyHomePageTest() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String homepageTitle = driver.getTitle();
		
		Assert.assertTrue(homepageTitle.contains("Enter"));
		System.out.println("Pass: the home page has been verified");
	}
	
	
	

}
