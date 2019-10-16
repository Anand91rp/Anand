package org.abstr;

public class sepat implements I1,I2{

	public void cliName() 
	{
   System.out.println("TXS");

	}
   private void cliLocation() 
   {
   System.out.println("US");
   }
	@Override
	public void empName() {
System.out.println("anand");		
	}

	@Override
	public void empId() {
System.out.println("454545");		
	}

	@Override
	public void empLocation() {
System.out.println("chennai");		
	}
	
	public static void main(String[] args) {
		sepat s= new sepat();
		
		s.cliLocation();
		s.cliName();
		s.cliLocation();
		
		s.test1();
	}
	@Override
	public void test1() {
System.out.println("newage");		
	}
}
