package comparableGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TestComparable {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add( new Student(1,5,"a"));
		al.add(new Student(1,1,"d"));
		al.add(new Student(1,10,"b"));
		Collections.sort(al);
		al.forEach((n)->System.out.println(n.age));
	}

}
