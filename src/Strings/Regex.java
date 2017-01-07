package Strings;
// //Question :
// ^coal
// coaltar
// Result : 1
// tar$
// coaltar
// Result : 1
// rat
// algorate
// Result: 1​
// abcd
// efgh
// Result :0


import java.util.*;
import java.lang.*;
import java.io.*;

class Regex {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++){
		    String a = scan.next();
		    String b = scan.next();
		    int result=0;
		    if(a.charAt(0)=='^') result=begins(a.substring(1,a.length()),b);
		    else if (a.charAt(a.length()-1)=='$')result= ends(a.substring(0,a.length()-1),b);
		   else result=substring(a,b);
		    
		    System.out.println(result);
		}
	}
	
	public static int begins(String a, String b){
	    String sub=b.substring(0,a.length());
	   if(sub.equals(a)){ return 1;}
	    else return 0;
	}
	public static int ends(String a, String b){
	    String sub=b.substring(b.length()-a.length(),b.length());
        if(sub.equals(a)) return 1;
	    else return 0;
	    
	}
 	public static int substring(String a, String b){
	   if(b.contains(a)) return 1; 
	   else return 0;
 	}
}