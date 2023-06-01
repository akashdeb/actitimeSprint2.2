package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantAndDependant {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_1_4_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_1_4_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone&requestId=b1bf22a9-8aa5-446c-94bf-4ab2a9e8a35b&as-backfill=on");
		
		WebElement starlightPrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../..//div[text()='₹61,999']"));
		
		String price = starlightPrice.getText();
		System.out.println(price);
	}

}
