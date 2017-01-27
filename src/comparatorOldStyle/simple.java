package comparatorOldStyle;

import java.util.ArrayList;
import java.util.Collections;

public class simple {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student(1,"d",18));
		al.add(new Student(2,"b",16));
		al.add(new Student(3,"c",17));
		
		System.out.println("Sorting by Name...");  
		Collections.sort(al,new NameComparator());
		al.forEach((n)->{
			Student s = (Student)n;
			System.out.print(s.name);});
		System.out.println("Sorting by age...");
		
		Collections.sort(al,new AgeComparator());
		al.forEach((n)->{
			Student s1 = (Student)n;
			System.out.println(s1.age);
		});
	}

}
