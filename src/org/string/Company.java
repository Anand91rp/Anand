package org.string;

public class Company {

	public static void main(String[] args) {
      
		// identityHashCode is used to identify the method location
		
		//Literal string
		System.out.println("***Literal string");
		
		String s="Java";
		String s1 ="Java";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		//Non-Literal string
		System.out.println("***Non Literal string");
		
		String h = new String ("selenium");
		String h1 = new String ("selenium");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		
		//Immutable....concat value stores in new memory
		System.out.println("***Immutable*****");
		
		String t = ("anu");
		String t1 =("anu");
		String cc = t.concat(t1);
		System.out.println(cc);
		
		System.out.println(System.identityHashCode(t));
		System.out.println(System.identityHashCode(t1));
		System.out.println(System.identityHashCode(cc));			
		
		
		//Mutable - String buffer- apppend value stores in 
		//List m/y address
		System.out.println("***String buffer mutable****");
		
		StringBuffer b = new StringBuffer ("saranya");
		StringBuffer b1 = new StringBuffer ("saranya");
		
		StringBuffer ap = b.append(b1);
		System.out.println(ap);
		
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(b1));
		System.out.println(System.identityHashCode(ap));
		
		
		//Mutable - String builder - apppend value stores in 
		//List m/y address
		System.out.println("***String Builder ****");
		
		StringBuilder c = new StringBuilder ("kavya");
		StringBuilder c1 = new StringBuilder ("kavya");
		
		StringBuilder c2 = c.append(c1);
		System.out.println(c2);
		
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
	}

}
