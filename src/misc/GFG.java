package misc;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void findpair(int[] n , int len,int k){
        HashSet<Integer> set = new HashSet<Integer>();
        int count=0;
        for(int i=0;i<len;i++){
          //  System.out.print(n[i]-k+" "+ n[i]+k);
            if( (set.contains(n[i]-k)) || (set.contains(n[i]+k)) ){
                count ++;
            }else{
                set.add(n[i]);
            }
        }
       System.out.println(count);
    }
    
	public static void main (String[] args) {
    	Scanner sc = new Scanner (System.in);
    	int n=sc.nextInt();
    	while(n>0){
    	    int len = sc.nextInt();
    	    int [] num = new int[len];
    	    for(int i=0;i<len;i++){
    	    	num[i]=sc.nextInt();
    	    }
    	    int k=sc.nextInt();
    	    findpair(num,len,k);
    	    n--;
    	}
	}
}