package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniqueElementsinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("ashu");
		l1.add("vivu");
		List<String> l2 = new ArrayList<String>();
		l2.add("ashwini");
		l2.add("vivek");
		l2.add("sandy");
		l2.add("vivu");
		List<String> l3 = new ArrayList<String>();
		l3.addAll(l1);
		l3.addAll(l2);
		Collections.sort(l3);
		System.out.println(l1.toString() + " " + l2.toString() + " " + l3.toString());
		
		for(int i=0;i<l3.size()-1;i++){
			if(!l3.get(i).equals(l3.get(i+1)))
				System.out.println(l3.get(i) + " ");
		
	}
		
		
	}
}
