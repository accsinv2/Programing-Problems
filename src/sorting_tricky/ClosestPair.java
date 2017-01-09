package sorting_tricky;

public class ClosestPair {
	
//	/Find the closest pair from two sorted arrays
//http://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/
	
	//Given two sorted arrays and a number x, find the pair whose 
	//sum is closest to x and the pair has an element from each array.

	//We are given two arrays ar1[0…m-1] and ar2[0..n-1] and 
	//a number x, we need to find the pair ar1[i] + ar2[j] 
	//such that absolute value of (ar1[i] + ar2[j] – x) is minimum.
	
	
	
	public static void find(int a1[],int a2[],int x){
		
		int i=0;
		int j=a2.length-1;
		int v1=0;
		int v2=0;
		int diff=Integer.MAX_VALUE;
		while(i<a1.length && j>=0){
			if(Math.abs(a1[i]+a2[j]-x) < diff ) {
				diff = Math.abs(a1[i]+a2[j]-x); 
				v1=a1[i];
				v2=a2[j];
			}
			
			if(a1[i]+a2[j]>x) j--;
			else i++;
		}
		
		System.out.println(v1+" "+v2);
	}
	
	public static void main(String[] args) {
		int a1[]={1, 4, 5, 7};
		int a2[] = {10, 20, 30, 40};;
		int x=50;
		
		find(a1,a2,x);
	}
	
	
}
