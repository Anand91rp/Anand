package Accspec;

public class New1 {
	
	static int a=100;
	static int b=200;
	static int c;
	
	public static void empId() {
		c=a+b;
		System.out.println(c);
	
	}
	public static void empName() {
		c=a-b;
		System.out.println(c);
	
	}

	public static void main(String[] args) {
empId();
empName();

//Class Name.method name(); // to call the static method using class name
	}

}
