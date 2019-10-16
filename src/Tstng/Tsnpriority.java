package Tstng;

import org.testng.annotations.Test;

public class Tsnpriority {


	@Test(priority = -10)
	public void testCase3() {
		
		System.out.println("TestCase3");
		
	}
	@Test(priority = -30)
	public void testCase1() {
		System.out.println("TestCase1");

	}
	@Test(priority = 45)
	public void testCase5() {
		System.out.println("TestCase5");

	}
	
	@Test(priority = 1)
	public void testCase2() {
		System.out.println("TestCase2");

	}
	
	@Test(priority = 2)
	public void testCase4() {
		System.out.println("TestCase4");

	}

}
