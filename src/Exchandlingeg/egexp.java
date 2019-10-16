package Exchandlingeg;

public class egexp {

	public static void main(String[] args) {
		
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		try {
			System.out.println(5/0);
		}
		
		catch(ArithmeticException  e) {
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
			System.out.println("Dont divide by zero");
		}
		catch(Throwable  e) {
			System.out.println("Null means empty");
		}
			finally {
				 System.out.println("Finally block");
				 System.out.println(5);
			 
			}
		}
	}


