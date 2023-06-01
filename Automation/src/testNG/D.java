package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D {
	
	@Test
	public void a() {
		System.out.println("Hi");
	}
	
	@Test(dependsOnMethods = "a")
	public void b() {
		Assert.fail();
		System.out.println("Will u go for a date");
	}
	
	@Test (dependsOnMethods = "b")
	public void c() {
		System.out.println("Bye");
	}

}
