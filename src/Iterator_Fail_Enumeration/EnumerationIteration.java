package Iterator_Fail_Enumeration;
import java.util.*;

/*
The Enumeration interface defines the methods by which you can enumerate
(obtain one at a time) the elements in a collection of objects.

This legacy interface has been superceded by Iterator. 
Although not deprecated, Enumeration is considered obsolete for new code.
However, it is used by several methods defined by the legacy classes such as Vector
and Properties, is used by several other API classes, and is currently in widespread
use in application code.*/
public class EnumerationIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//enumeration cannot work on hashmap it works on hashtable and vectors only
		//Methods are provided to enumerate through the elements of a vector,
		//the keys of a hashtable, and the values in a hashtable.
		HashMap<Integer,Integer> student = new HashMap<Integer,Integer>();
		//Defining a new HashMap
		student.put(1, 5);
		student.put(2,5);
		//adding legacy class
		Vector<Integer> lis = new Vector<Integer>();
		lis.add(5);
		lis.add(6);
		
		Hashtable<Integer,Integer> studenttable = new Hashtable<Integer,Integer>();
		//Defining a new HashMap
		studenttable.put(3, 5);
		studenttable.put(2,150);
		studenttable.put(10,100);
		
		//Enumeration is used by methods defined in legacy class,
		//Unless typecasted
		//Non legacy class dont have elements method that build up enumeration
				//enumeration casting...not allowed
		
		//Enumeration<Integer> enum1 = (Enumeration<Integer>) student.keySet();
		//throws error
		//Exception in thread "main" java.lang.ClassCastException: 
		//java.util.HashMap$KeySet cannot be cast to java.util.Enumeration
		//at Iterator_Fail_Enumeration.EnumerationIteration.main(EnumerationIteration.java:30)
		
		Enumeration<Integer> hashenum1 = studenttable.elements();
		//Enumeration<Integer> hashenum2 = studenttable.values();
		Enumeration<Integer> hashenum3 = studenttable.keys();


		Enumeration<Integer> enum2 = lis.elements();
		
		while(enum2.hasMoreElements()){
			System.out.println(enum2.nextElement());
		}
		System.out.println("***********");
		
		//prints elemnt in decreasing order of key element
		while(hashenum1.hasMoreElements()){
			System.out.println(hashenum1.nextElement());
		
		}
		System.out.println("******Iterate over keys *****");
		while(hashenum3.hasMoreElements()){
			System.out.println(hashenum3.nextElement());
		}	
		
	}

}
