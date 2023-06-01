package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void demo()
	{
		String a = "abc";
		String b = "def";
		
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(a, b);
		s.assertAll();
		System.out.println("Pass");
		
	}

}
