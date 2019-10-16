package costest;

public class DataTypes {

	
	//Non Argument
	public DataTypes() {
		System.out.println("Default Constructor");
	}
	
	
	//Argument
	
	public DataTypes(String name) {
		System.out.println(name);
	}
	
	public DataTypes(int empId) {
		System.out.println(empId);
	}
	
	public DataTypes (float avg) {
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		
		DataTypes d = new DataTypes();
		DataTypes d1 = new DataTypes("Anu");
		DataTypes d2 = new DataTypes(1544445);
		DataTypes d3 = new DataTypes(65.748f);

	}

}
