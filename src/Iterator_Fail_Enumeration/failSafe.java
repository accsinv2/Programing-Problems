package Iterator_Fail_Enumeration;


import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class failSafe {
	

	public static void main(String[] args) {
		
		Map<Integer,Integer> student = new ConcurrentHashMap<>();
		//Defining a new HashMap
		student.put(3, 5);
		student.put(2,10);
		Iterator<Integer> itr = student.keySet().iterator();
		
		while(itr.hasNext()){
			System.out.println(student.get(itr.next()));
			//student.put(4,40); will print 40 also
			//keyset gets sorted
			student.put(1,89);
			//will not print 89.
			//set is sorte accordin to the key.
			
		}
		
	}

}
