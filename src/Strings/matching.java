package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * 2. String Matching problem with s set of rules
i. Count 1 if an Upper case letter is followed by any Upper case letter
ii. Count 1 if an Upper case letter is followed by its same Lower case letter and dissolve the pair.
iii. if two lower case letters are present without a match stop and return count
Example: ABba will return 3 as A match with B, B matches with b and gets dissolved and then A matches with a and gets dissolved  
 */

public class matching {

	public int match(String test){

		char[] chars = test.toCharArray();
		List<Character> matching = new LinkedList<Character>();
		for (char c : chars) {
			matching.add(c);
		}
		int index=-1;
		int k=0;
		int upper=0;
		int lower=0;
		int i=0;
		int count=0;
		while(i<matching.size() && matching.size()!=0){
			
			char a = matching.get(i);
			if(upper==1){
				if(Character.isUpperCase(a)){
					//count=count+1;
				}
				else if ((Character.toUpperCase(a)== matching.get(i-1))) {
					index=i;
					count=count+1;
					matching.remove(i-1);
					matching.remove(i-1);
					i=i-2;
					upper=0;lower=0;
				}
			}
			else if(lower==1){
//				if(Character.isLowerCase(matching.get(i))){
//					break;
//				}
			}	
			if(i>= 0){
				if(Character.isLowerCase(matching.get(i))) lower=1;
				if(Character.isUpperCase(matching.get(i))) upper=1;
				//System.out.println(count);
			}
			i++; 
		}
		return count;
	}

	public static int matchmethod2(String test){
		char[] strArr = test.toCharArray();
		int count=0;
		int index=0;
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<strArr.length;i++){
			if(!s.empty()){
				char c = s.peek();
				if(Character.isUpperCase(c) && (Character.isUpperCase(strArr[i]))){
					count++;
					s.push(strArr[i]);
				}
				if(Math.abs((int)c-(int)strArr[i])==32) {
					count ++;
					s.pop();
				}
			}else{
				s.push(strArr[i]);
			}
		}

		return count;
	}

	public static void main(String[] args) {

		//String test = "ABba";
		String test ="YVvyGSAJjJjjaWwsg";
		matching obj =  new matching();
		int resultmethod1 = obj.match(test);
		//int matchmethod2 = obj.match(test);
		System.out.println(resultmethod1);
	}

}
