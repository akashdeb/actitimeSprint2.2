package testNG;

import org.testng.annotations.Test;

public class B {
	
	@Test(priority = 1)
	public void akash() {
		System.out.println("Name = Akash");
	}
	
	@Test(priority = 1)
	public void vikas() {
		System.out.println("Name = Vikas");
	}
	
	@Test(priority = 0)
	public void prakash() {
		System.out.println("Name = Prakash");
	}

}
