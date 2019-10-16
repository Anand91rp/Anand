package Tstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Employee {
	
	
	@Test
	public void testCase3() {
		
		System.out.println("TestCase3");
		
	}
	@BeforeClass
	public void testCase1() {
		System.out.println("TestCase1");

		
	}
	@AfterMethod
	public void testCase5() {
		System.out.println("TestCase5");

	}
	
	@BeforeMethod
	public void testCase2() {
		System.out.println("TestCase2");

	}
	
	@AfterClass
	public void testCase4() {
		System.out.println("TestCase4");

	}
}
