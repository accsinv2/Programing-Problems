package overridedefaults;
import java.util.*;

public class OveerideEquals {
	
	//Overriding .equals method.
	//for implementing hashmap of object as keys
	// we need to ovveride the equals and hashCode method of object class
	//the overriden method will decide how to check for equal objects
	//to identify duplicate keys
	// hashCode will define what the hashCode to be genrated for a given object
	String name;
	  
	public OveerideEquals(String n){
	name=n;
	}
	 
	 //override equals
	public boolean equals(Object o){
//	if((o instanceof OveerideEquals)&&!(((OveerideEquals)o).name.equals(name)))
		//i have changed to not equal to will behave opposite
		if((o instanceof OveerideEquals)&&(((OveerideEquals)o).name.equals(name)))	
	return true;
	else
	return false;
	}



}


