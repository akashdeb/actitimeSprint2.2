package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowID {

	public static void main(String[] args) {
		//Launch 1
		ChromeDriver driver1 = new ChromeDriver();
		
		String windowID1 = driver1.getWindowHandle();
		
		System.out.println(windowID1);
		
		//Launch 2
		ChromeDriver driver2 = new ChromeDriver();
		
		String windowID2 = driver2.getWindowHandle();
		
		System.out.println(windowID2);
		
		

	}

}
