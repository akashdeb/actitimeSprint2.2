package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to the url
		driver.get("https://www.google.com/search?q=selenium&rlz=1C1JJTC_enIN996IN997&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj1vb3Z3dj-AhWkUGwGHbUhAo4Q_AUoAXoECAIQAw&biw=1366&bih=604&dpr=1");

		WebElement secondImageOfSelenium = driver.findElement(By.xpath("(//img[@class=\"rg_i Q4LuWd\"])[2]"));
		
		String altTextOfImage = secondImageOfSelenium.getAttribute("alt");
		
		if(altTextOfImage.contains("Selenium")) {
			System.out.println("Pass: the alt text has been verified");
		}
		
		else
			System.out.println("Fail: the alt text has not been verified");

	}

}
