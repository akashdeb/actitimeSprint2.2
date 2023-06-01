package crossBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		CrossBrowserTesting.test(new ChromeDriver());
		System.out.println("The application has been tested on chrome");

		CrossBrowserTesting.test(new FirefoxDriver());
		System.out.println("The application has been tested on firefox");
		
		CrossBrowserTesting.test(new EdgeDriver());
		System.out.println("The application has been tested on edge");


	}

}
