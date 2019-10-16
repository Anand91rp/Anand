package Exchandlingeg;

public class otrexp {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {//outer try
			System.out.println("outer try");
			System.out.println(5/0);
			
			try {
				System.out.println(8/1);
		}
		
		catch(ArithmeticException  e) {//inner catch
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
			System.out.println("Dont divide by zero");
		}
		
			finally {//inner finally
				 System.out.println("Finally block");
				 System.out.println(10);
			 
			}
			
		}
		
		catch(Throwable  e) {//outer catch
			System.out.println("outer catch");
	}
		finally {//outer finally
			 System.out.println("Finally block");
			 System.out.println(20);
		 
		}
	}
	}


