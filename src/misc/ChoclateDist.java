package misc;

import java.util.Arrays;

public class ChoclateDist {
///http://www.geeksforgeeks.org/chocolate-distribution-problem/
	//Sort and move one block of k at a time,
	//check if the diff between min and the new element id small
	//if yes pick that window, flag it if no carryon
	//Time Complexity : O(n Log n)
	public static void main (String args[]){
	   int a[]={7, 3, 2, 4, 9, 12, 56} ;
		//int a[] = {3, 4, 1, 9, 56, 7, 9, 12} ;
		// 1 3 4 7 9 9 12 56
		 Arrays.sort(a);
		 int k=3, dif=a[k-1]-a[0],i=0,flag=0;
		 
		 while(i+k-1<a.length){
			 if((Math.abs(a[i+k-1]-a[i])) < dif) {
				 dif=Math.abs(a[i+k-1]-a[i]);
				 flag=i;
				 i=i+1;
			 }
			 else i=i+1;
		 }
		 
		 
		 for(int j=flag;j<flag+k;j++)
		 System.out.print (a[j]+" ");
		 
	}
}
