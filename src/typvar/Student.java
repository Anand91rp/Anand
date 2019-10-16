package typvar;

public class Student {

	int a,b,c;
	
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

		Student s = new Student();
		s.Student();
		s.sub();
		
		
	}

}
