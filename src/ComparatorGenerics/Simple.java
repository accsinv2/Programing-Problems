package ComparatorGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simple {

	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		List<Student> al = new ArrayList<Student>();
		al.add(new Student(1,"d",18));
		al.add(new Student(2,"b",16));
		al.add(new Student(3,"c",17));
		
		System.out.println("Sorting by Name...");  
	//	Collections.sort(al,new N	ameComparator());
		Collections.sort(al,new AgeComparator());  

		al.forEach((n)->{System.out.print(n.name);});
		System.out.println("Sorting by age...");
		
		Collections.sort(al, new NameComparator());
		al.forEach((n)->{System.out.println(n.age);
		});
	}

}
