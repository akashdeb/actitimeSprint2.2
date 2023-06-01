package testNG;

import org.testng.annotations.Test;

public class F {
	
	@Test(groups = "smoke", priority = 1)
	public void signUp() {
		System.out.println("the user has signed up");
	}
	
	@Test(groups = "smoke", priority = 2)
	public void signIn() {
		System.out.println("the user has signed In");
	}
	
	@Test(groups = "regression", priority = 3)
	public void compose() {
		System.out.println("the user has composed");
	}

}
