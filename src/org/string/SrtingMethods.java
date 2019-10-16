package org.string;

public class SrtingMethods {

	public static void main(String[] args) {
	
		// S a r a n y a 
		// 0 1 2 3 4 5 6 (Index)
		String name = "Saranya";
		String s1  = "saranya";
		//CharAt

		char c = name.charAt(3);
		System.out.println(c);


		//to UpperCase.

		String up = name.toUpperCase();
		System.out.println(up);


		//toLowercase

		String lo = name.toLowerCase();
		System.out.println(lo);
		
		//startsWith
		
		boolean se = name.startsWith("s");
        System.out.println(se);

        //endsWith

		boolean sw = name.endsWith("a");
        System.out.println(sw);
        
        //contains
        
		boolean co = name.contains("y");
        System.out.println(co); 
        
        //equals
        
		boolean eq = name.equals(s1);
        System.out.println(eq); 
        
        //equalsIgnoreCase
        
		boolean e1 = name.equalsIgnoreCase(s1);
        System.out.println(e1); 
        
        //indexOf
        
		int io = name.indexOf("a");
        System.out.println(io); 
        
        //equalsIgnoreCase
        
		int ko = name.lastIndexOf("a");
        System.out.println(ko); 
        
        //length
        
		int l = name.length();
        System.out.println(l); 
        
        //concat
        
		String cd = name.concat(s1);
        System.out.println(cd); 
        
        //replace
        
		String re = name.replace("a","i");
        System.out.println(re); 
        
        //replaceAll
        
		String ra = name.replaceAll(name,"Anu");
        System.out.println(ra); 
             
        //isEmpty
        
        String d=" ";
		boolean bn = d.isEmpty();
        System.out.println(bn); 
             
        //trim
        
        String h =" welcome to ";
		String trim = h.trim();
        System.out.println(trim); 
               
        //subString
        String ss = name.substring(3);
        System.out.println(ss); 
        
        CharSequence sec = name.subSequence(3, 6);   //Will print the (n-1) value
        System.out.println(sec);
        
        // Split
        
        String t = " Welcome to java class";
        String[] sp = t.split("e");     
        System.out.println(sp[2]);
        
        // Welcome to  java class
          // 0      1    2    3
        //It will split based on space and it will get stored in array and we have to call the corresponding array index
        
               
         
		
	}

}
