package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptions {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to the URL
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select=new Select(carDropdown);
		
		System.out.println("All options are : ");
		List<WebElement> allOption = select.getOptions();
		for(WebElement option:allOption) {
			System.out.println(option.getText());
		}
		
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		System.out.println("The selected options are : ");
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for(WebElement selected:selectedOptions) {
			System.out.println(selected.getText());
		}
		
		String firstOption = select.getFirstSelectedOption().getText();
		
		System.out.println("The First selected option is : "+firstOption);		
		
	}

}
