package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetDimension {

	public static void main(String[] args) {
		//Launching the browser
		ChromeDriver driver=new ChromeDriver();
		//Fetching the dimension of the browser
		Dimension dimension = driver.manage().window().getSize();
		
		System.out.println(dimension);
		//fetching the width
		int width = dimension.getWidth();
		//fetching the height
		int height = dimension.getHeight();
		//printing the height
		System.out.println("The height is : "+height);
		//printing the width
		System.out.println("The Width is : "+width);

	}

}
