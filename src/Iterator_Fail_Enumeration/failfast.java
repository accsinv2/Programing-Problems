package Iterator_Fail_Enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class failfast {
	
	public static void main(String[] args) {
		//Demonstrate concurrent modification exception
		
		List<Integer> listStud= new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		Iterator<Integer> listIterator = listStud.iterator();
		
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
			listStud.add(5); // throws concurrent modification error
			//
			//the below code is  responsible for this error
//			 final void checkForComodification() {
//		            if (modCount != expectedModCount)
//		                throw new ConcurrentModificationException();
//		        }
		}
	}	
}
