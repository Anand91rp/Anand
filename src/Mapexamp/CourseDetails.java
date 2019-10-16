package Mapexamp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CourseDetails {

	public static void main(String[] args) {

   Map<Integer,String> m = new LinkedHashMap<Integer,String>();

   
  //Values
   
   m.put(10, "anu");
   m.put(20, "saranya"); 
   m.put(30, "anand");
   m.put(10, "vel");
   
   System.out.println(m);
   
   
   //To get the value
   
   String s = m.get(10);
   
   System.out.println(s);
   
   
   //Contains key
   
   boolean ck = m.containsKey(10);
   System.out.println(ck);
   
   //ContainsValue
   
   boolean cv = m.containsValue("Anu");
   System.out.println(cv);
   
   //Return type of key is set
   
   //To get only the key
   
   Set<Integer> h = m.keySet();
		System.out.println(h);
   
   
   //To get only the value
   
   Collection<String> v =m.values();
   
   System.out.println(v);
   
   
   //to iterate the may we need to use "Entry set"
   
   Set<Entry<Integer,String>> e = m.entrySet();
   for (Entry<Integer,String>x:e) {
	   System.out.println(x.getKey());
	   System.out.println(x.getValue());
   }
    
    
	}

}
