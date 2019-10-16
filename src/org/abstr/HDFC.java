package org.abstr;

public class HDFC extends RBI{

	private void Location1() 
	{
    System.out.println("OMR");

	}

	@Override
	public void fixedDeposit() 
	{
     System.out.println("8%");		
	}
	@Override
	public void jointAcc() 
	{
   System.out.println("7%");		
	}
	public static void main(String[] args) 
	{

    HDFC h = new HDFC();
    h.Location1();
    h.fixedDeposit();
    h.jointAcc();
    h.savAcc();
	}
}
