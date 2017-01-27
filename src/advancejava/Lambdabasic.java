package advancejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//http://www.developer.com/java/start-using-java-lambda-expressions.html
//http://www.programcreek.com/2014/01/5-different-syntax-of-lambda-expression/
public class Lambdabasic {

	public static void main(String[] args) {
//		List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
//		features.forEach(n -> System.out.println(n));
//		features.forEach(System.out::println);
		
		//2
//		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
//		map1.put(1,10);	map1.put(2,20);	map1.put(3,30);
//		map1.forEach((k,v)->System.out.println("item "+ k+ " value "+ v));
			
		//3
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
	
		//using lambda expression
		items.forEach(
				(k,v)->{
					System.out.print(v);
					if(k.equals("D"))System.out.print("this is D");
					if(k.equals("D") && v==40)System.out.print("this is D");
				});
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
					System.out.println("Hello E");
			}
		});
		
		/*
		 * If we wanted to collect the blue shapes into a new List, we could say:
						List<Shape> blue = shapes.stream()
                         .filter(s -> s.getColor() == BLUE)
                         .collect(Collectors.toList());
		 */
		
		/*
		 * For example, if we wanted to color only the blue shapes red, we could say:

				shapes.stream() 
				      .filter(s -> s.getColor() == BLUE)
				      .forEach(s -> s.setColor(RED));
		 */
		
		
	}

}
