package org.sel.jav.test;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//nextLine
		
		System.out.println("Enter your name");
		String n1 =sc.nextLine();
		System.out.println("Name is:"+n1);
		
		//next
		
		System.out.println("Enter first name");
		String n =sc.next();
		System.out.println("First Name is:"+n);
		
		//nextlong
		
		System.out.println("Enter the phone nuber");
		long n2 =sc.nextLong();
		System.out.println("phone number is:"+n2);
		
		//nextFloat
		
		System.out.println("Avg mark");
		float n21 =sc.nextFloat();
		System.out.println("Avg mark is:"+n21);
	
		//nextDouble
		
		System.out.println("Enter salary");
		double nn2 =sc.nextDouble();
		System.out.println("sal:"+nn2);
		
		//nextBoolean
		
		System.out.println("Emp status");
		boolean m =sc.nextBoolean();
		System.out.println("Emp status:"+m);
	}

}
