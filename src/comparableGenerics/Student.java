package comparableGenerics;

public class Student implements Comparable <Student> {
	
	int roll;
	String name;
	int age;
	Student(int roll, int age,String name ){
		this.roll=roll;
		this.name=name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student st) { //compares student based on age
		if(age==st.age)  
			return 0;  
			else if(age>st.age)  
			return 1;  
			else  
			return -1; 
	}


}
