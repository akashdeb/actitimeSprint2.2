package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullcsreen {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		driver.manage().window().fullscreen();

	}

}
