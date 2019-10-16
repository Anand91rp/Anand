package Exchandlingeg;

public class New1 {

	public static void main(String[] args) {
 System.out.println(1);
 System.out.println(2);
 System.out.println(3);
 System.out.println(4);
 
 try {
	 System.out.println(4/0);
 }
 
 catch(ArithmeticException  e) {
	 System.out.println("Dont divide by zero");
 }
 finally {
	 System.out.println("Finally block");
	 System.out.println(5);
 }
	}

}
