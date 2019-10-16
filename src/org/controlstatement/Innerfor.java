package org.controlstatement;

public class Innerfor {

	public static void main(String[] args) {

          for(int i=1;i<3;i++) {
        	  
        	  for(int j=1;j<=3;j++) {
			
			System.out.println(j);
		}
	}
	}
}

//Execution
//i=1  j=1   1
//i=1  j=2   2
//i=1  j=3   3
//
//i=2  j=1   1
//i=2  j=2   2
//i=2  j=3   3
//
//i=3  j=1   1
//i=3  j=2   2
//i=3  j=3   3