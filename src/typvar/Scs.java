package typvar;

public class Scs {
	
	 static int a,b,c;
	 
	 static Scs s;
		
		private void  Student(){
			a=10;
			b=20;
			c=a+b;
			System.out.println(c);
	 
			}
		
		private void sub() {
			c=a-b;
			System.out.println(c);
		}
		
		public static void main(String[] args) {

			s = new Scs();
			s.Student();
			s.sub();
			
			

	}

}
