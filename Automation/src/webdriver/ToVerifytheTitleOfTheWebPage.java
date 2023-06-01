package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifytheTitleOfTheWebPage {

	//Launch the browser
	//Navigate to facebook
	//Verify the title
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String titleOfFacebook = driver.getTitle();
		
		System.out.println(titleOfFacebook);
		
		if(titleOfFacebook.contains("Facebook")) {
			System.out.println("Pass: the title is verified");
		}
		
		else
			System.out.println("Fail: the title is not verified");

	}

}
