package misc;

import java.util.HashMap;
import java.util.Scanner;

/*Complete the function below*/
class kanagram
{
     public static void areKAnagrams(String s1, String s2, int k)
     {
      
          HashMap<Character,Integer> map = new HashMap<Character,Integer>();
          char [] ch1 = s1.toCharArray();
          char [] ch2 = s2.toCharArray();
           
          int count=0;
          if(s1.length() != s2.length()) System.out.println("0");
          else{
              for(int j=0;j<ch1.length;j++) {
                  if(!map.containsKey(ch1[j])) map.put(ch1[j],1);
                  else {
                      int count3=map.get(ch1[j])+1;
                      map.put(ch1[j],count3);
                  }
               }
               
               for(int l=0;l<ch2.length;l++) {
                   if(!map.containsKey(ch2[l]) || map.get(ch2[l])<=0) count++;
                   else {
                       int count2=map.get(ch2[l])-1;
                       map.put(ch2[l],count2);
               }
              
          }
//          if(count==k) return true;
//          else return false;
               if(count==k) System.out.println("1");
            else System.out.println("0");
          
      }
    //   return false;
    }
    
    public static void main(String args []){
        
        Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      for(int i=0;i<n;i++){
          
        String  s1= sc.next();
        String  s2 = sc.next();
          int k = sc.nextInt();
         areKAnagrams(s1,s2,k);
         
      }  
    }
}