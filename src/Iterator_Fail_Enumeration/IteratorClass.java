package Iterator_Fail_Enumeration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> student = new HashMap<Integer,Integer>();
		//Defining a new HashMap
		student.put(1, 5);
		student.put(2,5);

		
		//Method 1
		//For each
		for(int key: student.keySet()){
			System.out.println("Using for each");
			System.out.println("key : "+ key+" value : "+ student.get(key));
		}
		
		//Method 2
	    //keyset iterator
		Set<Integer> setOfKeys = student.keySet();
		Iterator<Integer> setiterator = setOfKeys.iterator();
		while(setiterator.hasNext()){
			System.out.println("Using for set iterator");
			System.out.println("key : "+ setiterator.next()+" value : "+ student.get(setiterator.next()));
			
		}
  }
}
