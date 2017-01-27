package advancejava;

import java.util.HashMap;

public class CustomHashmap {
	int id;
	String name;
	
	
	@Override
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		else if(this.getClass()!=o.getClass()){
			return false;
		}
		final CustomHashmap other = (CustomHashmap) o;
		if(other.id==0 && this.id==0){
			return true;
		}
		if(other.name==null && this.name==null){
			return true;
		}
		if(this.name.equals(other.name) && this.id==other.id){
			return true;
		}
		else return false;		
		
	}
	
	@Override
	public int hashCode(){
		return 10*this.id;
	}
	
	public CustomHashmap(int id, String name){
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {

  CustomHashmap obj = new CustomHashmap(10,"Vivek");
  HashMap<CustomHashmap,Integer> map = new HashMap<CustomHashmap,Integer>();
  map.put( new CustomHashmap(10,"Vivek"),15 );
  map.put( new CustomHashmap(20,"Singh"),20 );
  map.put( new CustomHashmap(30,"Vivek"),30 );
  
  map.forEach( (k,v)-> {System.out.println(k.name);});

	}

}
