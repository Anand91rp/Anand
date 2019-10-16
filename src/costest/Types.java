package costest;

public class Types extends DataType {

	public Types() {
		super();
		System.out.println("child default");
		
	}
	
	public Types (int age) {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		Types c = new Types();
		Types c1 = new Types(100);
		
	}
}
