package testNG;

import org.testng.annotations.Test;

public class C {
	
	@Test(invocationCount = 2)
	public void a() {
		System.out.println("Oh");
	}
	
	@Test
	public void b() {
		System.out.println("Jaane");
	}
	
	@Test
	public void c() {
		System.out.println("Jaana");
	}

}
