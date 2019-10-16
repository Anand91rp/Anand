package Tstng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramettesng {
	
	//  <parameter name ="ss" value = "siva"></parameter>
	//  <parameter name ="ram" value = "nirmal"></parameter>
	
    @Parameters({"ss","ram"})
	@Test
	public void testCase3(String s1,String s2) {
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	@Test
	public void testCase1() {
		System.out.println("TestCase1");

	}
	@Test
	public void testCase5() {
		System.out.println("TestCase5");

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
