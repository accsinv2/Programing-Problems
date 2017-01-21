package misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PasswordVerifier {
	
	
	
	BufferedReader br = null;
	static  List<String> inputPwdList = null;
	
	//Reading input from the file

	public PasswordVerifier(){
	try{
		inputPwdList = new ArrayList<String>();
		br = new BufferedReader(new FileReader(new File("data/say.in.txt")));
		readInputFile();
		}catch(Exception e){
		e.printStackTrace();
		}
	}
	
	//The method containsVowel checks if the string contains vowel
	//. It must contain at least one vowel.
	public boolean containsVowel(String password)
	 {
		for (char c : password.toCharArray()) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			 return true;
	 	}
	 return false;
	 }
	
	//check if a character is a vowel
	public static boolean isVowel(char c) {
		  return "AEIOUaeiou".indexOf(c) != -1;
		}
	
	//The method consecVowelsOrConsontants checks if there are 3 consecutive vowels
	//or consonants, if yes, return true, else returns false
	
	public boolean consecVowelsOrConsontants(String password) {
		 int vc = 0;// consec vowels
		 int cc = 0;// consec consonants
		 boolean prevcharisvowel = true;
		 for (char c : password.toCharArray()) {
			 if (isVowel(c)) // if char is a vowel
			 	{
				 if (prevcharisvowel) // and the prev char was a vowel too
					 vc++; // then increment
				 else // else this was the first vowel
				 {
					 vc = 1;
					 prevcharisvowel = true;
				 }
			 	} else// if consonant
			 	{
			 		if (prevcharisvowel)// and prev char was vowel
			 		{
			 			cc = 1; // this is the first consonant
			 			prevcharisvowel = false;
			 		} else
		 // else increment consecutive consonant count
			 			cc++;
			 	}
		 
			 if (vc == 3 || cc == 3)
				 return true;
		 }
		 	return false;
	}
	
	public boolean consecOccurances(String password) {
		 char prev;
		 char next;
		 if (password.length() < 2)
			 return false;
		 	for (int i = 0; i < password.length() - 1; i++) {
		 		prev = password.charAt(i);
		 		next = password.charAt(i + 1);
		 		if (prev == next && !exceptionRule(prev, next))
		 			return true;
		 	}
		 	return false;
		}
		 
	 private boolean exceptionRule(char prev, char next) {
		 StringBuffer s = new StringBuffer();
		 s.append(prev);
		 s.append(next);
		 
		 if (s.toString().equals("ee") || s.toString().equals("oo"))
			 return true;
		 return false;
		 }
	

	public static void main(String[] args) {
		
		PasswordVerifier passwords = new PasswordVerifier();
		passwords.readInputFile(); //reading the input passwords and storing in arraylist
		
		for(String eachpassword : inputPwdList){ //cheching for each password
			
			if(passwords.containsVowel(eachpassword) && !passwords.consecOccurances(eachpassword) 
					&& !passwords.consecVowelsOrConsontants(eachpassword) )
				 System.out.println("<" + eachpassword + ">" + " is acceptable.");
				else
				 System.out.println("<" + eachpassword + ">" + " is not acceptable.");
			
			
		}
		//Taking input from text file
		
		 
		
		
		

	}
	
	public void readInputFile(){
		String line = "";
		
		try{
			while((line = br.readLine()) != null){
				if(line.equals("end")) break;
		else{
			inputPwdList.add(line);
			}	
		}
		//System.out.println(inputPwdList.size());
			}catch(Exception e){
				e.printStackTrace();
			}
		}

}
