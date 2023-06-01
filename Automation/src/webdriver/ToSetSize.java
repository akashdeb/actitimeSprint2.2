package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSize {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		Dimension dim = new Dimension(700, 500);
		driver.manage().window().setSize(dim);

	}

}
