package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadUsingSikuli {

	public static void main(String[] args) throws FindFailed {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Pattern filename = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium1PMBatchApril\\Automation\\testData\\FileName.png");
		Pattern openButton = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium1PMBatchApril\\Automation\\testData\\OpenButton.png");

		Screen screen = new Screen();
		screen.wait(filename, 20);
		screen.type(filename, "C:\\Users\\AkashDeb\\eclipse-workspace_Selenium1PMBatchApril\\Automation\\testData\\abc.docx");
		screen.click(openButton);
		
	}

}
