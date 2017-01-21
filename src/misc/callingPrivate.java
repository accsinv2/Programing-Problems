package misc;

import java.lang.reflect.Field;

public class callingPrivate {

	public static void main(String[] args) {
      
		 StrangeReflectionExample instance = new StrangeReflectionExample();
		 StrangeReflectionExample copy = new StrangeReflectionExample();
       try{ 
        Field field = StrangeReflectionExample.class.getField("aCharacter");
        Field type = Field.class.getDeclaredField("type");
        type.setAccessible(true);
        type.set(field, String.class);
        field.set(instance, "Vivek");
       // instance.getClass().getDeclaredField("aCharacter").setAccessible(true);
        System.out.println(instance.aCharacter);
        System.out.println(copy.aCharacter);
       }catch (Exception e){
    	   e.printStackTrace();
       }
	}

}
