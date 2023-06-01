package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// navigation to the url
				driver.get("https://www.google.com/");
				
				driver.findElement(By.name("q")).sendKeys("selenium");
				Thread.sleep(2000);
				List<WebElement> allSugestions = driver.findElements(By.xpath("//span[contains(text(), 'selenium')]"));
			
				int noOfSuggestions = allSugestions.size();
				
				System.out.println("The no of suggestions are : "+noOfSuggestions);
				
				for(WebElement suggestion:allSugestions) { //suggestion = slenium 30_123421@chrome.gettext() = selenium 30
					
					if(suggestion.getText().equals("selenium 3x")) {
						suggestion.click();
						break;
					}
				}
			}

		}
