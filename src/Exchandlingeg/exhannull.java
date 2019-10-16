package Exchandlingeg;

public class exhannull {

	public static void main(String[] args) {

		try {
			String s = null;
			int length =s.length();
			System.out.println(length);
		}
		
		catch(ArithmeticException  e) {
			System.out.println("Dont divide by zero");
		}
		catch(NullPointerException  e) {
			System.out.println("Null means empty");
		}
			finally {
				 System.out.println("Finally block");
				 System.out.println(5);
			 
			}
		}
	
	}


