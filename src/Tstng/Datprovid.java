package Tstng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datprovid {
	
	@Test(dataProvider = "fff")
	public void test1(int i,String s) {
		System.out.println(i);
		System.out.println(s);

	}

	@DataProvider(name="fff")
	
	public Object[][] data() {
		
		Object[][] obj =new Object [3][2];
		
		obj[0][0]=34;
		obj[0][1]="ramesh";
		
		obj[1][0]=34;
		obj[1][1]="guna";
		
		obj[2][0]=34;
		obj[2][1]="ravi";
		return obj;
		
		//or
//		@DataProvider(name="fff")
//		public Object[][] data() {
//			return new Object [][]	{{87,"rahu"},{76,"tavi"},{58,"gun"}};
//					}
	}
}
