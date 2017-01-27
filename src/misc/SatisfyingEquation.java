package misc;



	import java.util.*;
	import java.lang.*;
	import java.io.*;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=906
class SatisfyingEquation {
	    public static void calPairs(int[] arr){
	        HashMap<Integer,ArrayList<Integer> > hmap = new HashMap<Integer,ArrayList<Integer>>();
	        int flag=0;
	        for(int k=0;k<arr.length-1;k++){
	            for(int j=k+1;j<arr.length;j++){
	            int sum = arr[k]+arr[j];
	            if(hmap.get(sum)==null){
	            	ArrayList<Integer> index =  new ArrayList<Integer>();
	            	index.add(j);
	            	index.add(k);
	                hmap.put(sum,index);
	            }
	            else{
	                hmap.get(sum).add(j);
	                hmap.get(sum).add(k);
	                if(hmap.get(sum).size()==4){
	                   hmap.get(sum).forEach(System.out::print) ;
	                   flag=1;
	                   break;
	                }
	                
	            }
	          }
	            if(flag==1) break;
	        }
	        
	    }
	    
public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++){
			    int arrlen = sc.nextInt();
			    
			    int[] arr = new int[arrlen];
			    for(int j=0;j<arrlen;j++){
			        
			        arr[j]=sc.nextInt();
			    }
			    calPairs(arr);
			}
		}
	}