package collections;

import java.util.ArrayList;
import java.util.List;

public class Copylist {

	public static void main(String[] args) {
	
			List<Integer> li =new ArrayList<Integer>();
			List<Integer> l1 =new ArrayList<Integer>();


			//To Add values in the list

			li.add(10);
			li.add(20);
			li.add(30);
			li.add(40);
			li.add(50);


			System.out.println(li);
			
			//To copy all values from one list to another
			
			l1.addAll(li);
			System.out.println(li);
			
			l1.add(500);
			
			System.out.println(l1);
			
			
//			//To remove the common values 
//			
//			l1.removeAll(li);
//			System.out.println(li);
			
			//To Retain the common values
			
			l1.retainAll(li);
			System.out.println(l1);
		
			
			
	}

}
