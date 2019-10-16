package costest;

public class DataType {
	
	//Non Argument
		public DataType() {
			this("Anu");
			System.out.println("Default Constructor");
		}
		
		
		//Argument
		
		public DataType(String name) {
			this(454545);
			System.out.println(name);
		}
		
		public DataType(int empId) {
			this(53.4548f);
			System.out.println(empId);
		}
		
		public DataType (float avg) {
			System.out.println(avg);
		}
		
		public static void main(String[] args) {
			
			DataType d = new DataType();


		}


}
