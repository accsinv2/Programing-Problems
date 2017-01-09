package overridedefaults;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class HashmapWithObjAsKeys {

	String name;
	//int roll;
	
	//Override equals, keeping name as key
	 @Override
	public boolean equals(Object o){
//		if((o instanceof OveerideEquals)&&!(((OveerideEquals)o).name.equals(name)))
			//i have changed to not equal to will behave opposite
			if((o instanceof HashmapWithObjAsKeys)&&(((HashmapWithObjAsKeys)o).name.equals(name)))	
		return true;
		else
		return false;
		}
	
	 public HashmapWithObjAsKeys(String n){
		name=n;
	}
	/*public void setRoll(int roll){
		this.roll=roll;
	}*/
	
	//Override hashCode
	//Whenever a.equals(b), then a.hashCode() must be same as b.hashCode().

	 @Override
		public int hashCode (){
				return name.length();
		}
	
		public static void main(String args[]){
		Map<Object,Object> m = new HashMap<Object,Object>();
		String s="Vivek";
		HashmapWithObjAsKeys o1 = new HashmapWithObjAsKeys(s);
		//passing by constructor is not necessary
	//	o1.setRoll(25);
		HashmapWithObjAsKeys o2 = new HashmapWithObjAsKeys(s);
	//	o2.setRoll(56);
		m.put(o1, 101);
		m.put(o2,5000);
		System.out.println("value "+ m.get(o2));
		
		ArrayList<Integer> achu =  new ArrayList<Integer>();
		ListIterator<Integer> it = achu.listIterator();

		//it.
		
		
		
		}
}
