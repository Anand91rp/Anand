package Tstng;

import org.testng.annotations.Test;

public class Ignorfail {


	@Test
	public void testCase3() {
		
		System.out.println("TestCase3");
		
	}
	
	//To ignore the test case
	@Test(enabled=false)
	public void testCase1() {
		System.out.println("TestCase1");

	}
	//Fail test case
	@Test
	public void testCase5() {
		//System.out.println);

	}
	
	@Test
	public void testCase2() {
		System.out.println("TestCase2");

	}
	
	@Test
	public void testCase4() {
		System.out.println("TestCase4");

	}

}
