package misc;

import java.util.Arrays;

public class MinimumNumberofPlatforms {
	//http://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
	
	public static int noofplatform(int [] arr, int [] dep,int flights){
		int platforms=0;
		
		Arrays.sort(arr);Arrays.sort(dep);
		int i=0,j=0;
		int max=0;
		while(i<arr.length && j<dep.length){
			if(arr[i] < dep[j]){
				platforms++;
				i++;
				if (max<platforms) max=platforms;
			}
			else {platforms--;
			j++;
			if (max<platforms) max=platforms;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		 int arr[] = {900, 940, 950, 1100, 1500, 1800};
		 int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		 int[] combined = new int[arr.length + dep.length];

		 Arrays.sort(combined);
		 int flights=arr.length;
		 int noOfPlatform=noofplatform(arr.clone(),dep.clone(),flights);
		 System.out.println(noOfPlatform);
		 
	} 

}
