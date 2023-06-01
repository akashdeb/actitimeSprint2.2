package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PrintPopUp {

	public static void main(String[] args) throws AWTException, FindFailed, InterruptedException {
		// launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern fileName = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium1PMBatchApril\\Automation\\testData\\FileNameForPrint.png");
		Pattern saveButton = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium1PMBatchApril\\Automation\\testData\\SaveButton.png");

		Screen screen = new Screen();
		screen.wait(fileName, 20);
		screen.type(fileName, "AutomationClass1Pm");
		screen.click(saveButton);
		


		
		

		

	}

}
