package testNG;

import org.testng.annotations.Test;

public class G {
	
	@Test(groups = "regression", priority = 4)
	public void sentMail() {
		System.out.println("the user has sent mail");
	}

	@Test(groups = "smoke", priority = 5)
	public void logout() {
		System.out.println("the user has logged out");
	}

}
