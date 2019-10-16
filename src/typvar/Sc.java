package typvar;

public class Sc {
  static int a,b,c;
	
	private static void  Student(){
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
 
		}
	
	private static void sub() {
		c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		Sc.Student();
		Sc.sub();
		
		

	}

}
