package collections;

import java.util.ArrayList;
import java.util.List;

public class genericelement {

	public static void main(String[] args) {
List<Integer> li =new ArrayList<Integer>();


//To Add values in the list

li.add(10);
li.add(20);
li.add(30);
li.add(40);
li.add(50);


System.out.println(li);


//To pick the particular value from the list

Integer i = li.get(2);
System.out.println(i);

//to get the index of particular value

int io=li.indexOf(10);
System.out.println(io);

//to get the last index of particular value

int ij=li.lastIndexOf(10);
System.out.println(ij);


//To add values In-between the list

li.add(2, 200);
System.out.println(li);

//To remove value from the list

li.remove(2);
System.out.println(li);

//to replace the vale in the list

li.set(2, 200);
System.out.println(li);


	}

}
