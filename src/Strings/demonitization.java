package Strings;


import java.util.*;
import java.lang.*;
import java.io.*;

public class demonitization {
	
	public static String merge(String a, String b){
		char[] chm=a.toCharArray();
       char[] chn=b.toCharArray();
       int i=chm.length-1,j=0,max=0;
       
       while(i>=0 && j<chn.length){
    	   if(chm[i]==chn[j]){
    		   int temp=i;
    		   while(i<chm.length && j<chn.length){
    			   if(chm[i]==chn[j]){
    				  
    				   i++;j++;
    			   }
    			   else{
    				   i++;
    			   }
    			   if(j>max) max=j;
    		   }
    		   i=temp;j=0;
    	   }
    	   i--;
       }
       String O=a+String.valueOf(chn,max,chn.length-max);
       return O;
       
}
	
	public static void match(String str,String M, String N){
	       char[] chm=M.toCharArray();
	       char[] chn=N.toCharArray();
	       int i;
	      
	     String O=merge(M, N);
	   //  System.out.println(String.valueOf(chn));
	         String[] strO =str.split(O) ;
	        String temp="";
	        
	        for( i=0;i<strO.length;i++){
	            if(!strO[i].equals(O))temp=temp+strO[i];
	           
	        }
	   

	        String[] strM =temp.split(M) ;
	         temp="";
	        for( i=0;i<strM.length;i++){
	            if(!strM[i].equals(M))temp=temp+strM[i];
	        }
	        String[] strN=temp.split(N) ;
	        
	        temp="";
	         for( i=0;i<strN.length;i++){
	             String s1=strN[i];
	             String s2=N;
	           
	            if(!s1.equals(s2) )  {
	                temp=temp+s1;
	            }
	            
	        }
	        if(temp.equals(""))System.out.println("-1");
	        else System.out.println(temp);
	    }
	    
		public static void main (String[] args) {
		
//			Scanner scan = new Scanner (System.in);
//			int n=scan.nextInt();
//			for(int i=0;i<n;i++){
//			    String str=scan.next();
//			    String M = scan.next();
//			    String N = scan.next();
//			    match(str,M,N);
//			}
		
			match("narendramodi","add","di");
		}
	}